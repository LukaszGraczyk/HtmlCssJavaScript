import * as THREE from 'three';
import { GeometryHelper } from './GeometryHelper.js';
import { TextHelper } from './TextHelper.js';
import { OrbitControls } from './OrbitControls.js';
		
// Scena, do której dodajemy obiekty, światła, kamerę i efekty.
let scene = new THREE.Scene();

// Kamera perspektywiczna
let camera = new THREE.PerspectiveCamera(
	75,     // fov
	window.innerWidth / window.innerHeight, // aspect ratio
	0.1,    // near
	1000    // far
);

/*
fov - field of view, czyli kąt widzenia jako parametr określający
jak szeroko widzimy na boki oraz do góry i do dołu.

aspect ratio - podział ekranu jako stosunek szerokości do wysokości,
dla kwadratu wartość ta wynosi 1:1=1, dla fullhd 16:9=1.777

near - odległość od kamery, od której obekty 3D znajdujące się w przestrzeni,
są rysowane na scenie, wszystko co znajduje się bliżej kamery niż odległość near,
nie będzie renderowane.

far - odległość od kamery, za którą obiekty 3D znajdujące się w przestrzeni,
nie są już rysowane na scenie, wszystko co znajduje się dalej od kamery niż odległość far,
nie będzie renderowane.
*/

// Umieszczenie kamery w punkcie o współrzędnych (0,1,7).
// Domyślnie kamera jest w punkcie (0,0,0).
camera.position.set(0,1,6);

// Dodanie kamery do sceny.
scene.add(camera);

// Obiekt renderujący scenę. Za pomocą niego namalujemy na canvas naszą scenę.
// Nie musimy dodawać canvas w pliku html ponieważ Three.js tworzy go automatycznie.
let renderer = new THREE.WebGLRenderer();

// Dostosowanie canvas do szerokości i wysokości ekranu.
renderer.setSize(window.innerWidth, window.innerHeight);

// Dodanie automatyczne canvas do body.
document.body.appendChild(renderer.domElement);

// Automatyczne dostosowywanie się wyświetlania na canvas przy zmianie rozmiaru okna.
window.addEventListener("resize", (e) => {
	camera.aspect = window.innerWidth / window.innerHeight;
	camera.updateProjectionMatrix();
	renderer.setSize(window.innerWidth, window.innerHeight);
});

// Tworzymy nowe instancje klas.
const geometryHelper = new GeometryHelper();							// Bryły przestrzenne
const textHelper = new TextHelper();									// Tekst trójwymiarowy
const gridXZ = new THREE.GridHelper(9,9); 								// Siatka pomocnicza grid
const orbitControls = new OrbitControls(camera,renderer.domElement); 	// Sterowanie myszką w scenie // Przekazujemy domElement ponieważ potrzebujemy zdażeń myszy

// Powołujemy do życia nowe odsłony obiektów geometrycznych bez tekstury.
let cube1 = geometryHelper.createCube({color: 0xff0000, wireframe: true, numSegments: 3});
let sphere1 = geometryHelper.createSphere({wireframe: true});
let cylinder1 = geometryHelper.createCylinder({wireframe: true});
let cone1 = geometryHelper.createCone({wireframe: true});
let tetrahedron1 = geometryHelper.createTetrahedron({wireframe: true});

// Powołujemy do życia nowe odsłony obiektów geometrycznych bez tekstury.
let cubeTextured1 = geometryHelper.createTexturedCube();
let sphereTextured1 = geometryHelper.createTexturedSphere();
let cylinderTextured1 = geometryHelper.createTexturedCylinder();
let coneTextured1 = geometryHelper.createTexturedCone();
let tetrahedronTextured1 = geometryHelper.createTexturedTetrahedron();

// Powołujemy do życia nowe odsłony obiektów tekstowych.
let text3d = null;
textHelper.create3dText({
	str: "Geometria",
	callbackReady: function( readyText3d ) {
		text3d = readyText3d;
		scene.add(text3d);
		text3d.position.x = -0.6;
		text3d.position.y = 1.5;
		text3d.position.z = 0;
	}
});

// Konfiguracja źródeł światła.
const color = 0xffffff;				// Kolor światła
const intensity = 1;				// Intensywność światła
const light1 = new THREE.DirectionalLight(color,intensity);		// Światło skierowane nr 1
const light2 = new THREE.DirectionalLight(color,intensity);		// Światło skierowane nr 2
const light3 = new THREE.DirectionalLight(color,intensity);		// Światło skierowane nr 3
light1.position.set(10,15,15);		// Pozycja światła nr 1
light2.position.set(-10,15,15);		// Pozycja światła nr 2
light3.position.set(0,-15,15);		// Pozycja światła nr 3
light1.target.position.set(0,0,0); 	// Pozycja oświetlanego przez światło nr 1 punktu
light2.target.position.set(0,0,0); 	// Pozycja oświetlanego przez światło nr 2 punktu
light3.target.position.set(0,0,0); 	// Pozycja oświetlanego przez światło nr 3 punktu

// Dodanie świateł do sceny.
scene.add(light1);
scene.add(light2);
scene.add(light3);
scene.add(light1.target);
scene.add(light2.target);
scene.add(light3.target);
	
// Dodanie brył do sceny.
scene.add(cube1);
scene.add(sphere1);
scene.add(cylinder1);
scene.add(cone1);
scene.add(tetrahedron1);

// Dodanie brył z teksturą do sceny.
scene.add(cubeTextured1);
scene.add(sphereTextured1);
scene.add(cylinderTextured1);
scene.add(coneTextured1);
scene.add(tetrahedronTextured1);

// Dodanie płaszczyzny siatki do sceny.
scene.add(gridXZ);

// Lokalizowanie poszczególnych elementów sceny w przestrzeni 3D względem układu współrzędnych xyz.
sphere1.position.x = 2; 				// Przesunięcie po osi x
cylinder1.position.x = 4; 	
cone1.position.x = -2;
tetrahedron1.position.x = -4;
cubeTextured1.position.set(0,-1,2);		// Przesunięcie po osi z
sphereTextured1.position.set(2,-1,2);
cylinderTextured1.position.set(4,-1,2);
coneTextured1.position.set(-2,-1,2);
tetrahedronTextured1.position.set(-4,-1,2);
gridXZ.position.set(0,-2,0); 			// Przesunięcie po osi y

// Obrót sfery tak by wzory na teksturze były widoczne.
sphereTextured1.rotateY(80.1);
cylinderTextured1.rotateY(3.1);
coneTextured1.rotateY(3.2);
tetrahedronTextured1.rotateY(1.7);

// Renderowanie sceny.
function render () {
	cube1.rotation.y += 0.002;			// Rotacja bryły wokół osi y
	cube1.rotation.x += 0.002;			// Rotacja bryły wokół osi x
	cube1.rotation.z += 0.002;			// Rotacja bryły wokół osi z
	sphere1.rotation.y += 0.002;	
	sphere1.rotation.x += 0.002;	
	sphere1.rotation.z += 0.002;	
	cylinder1.rotation.y += 0.002;	
	cylinder1.rotation.x += 0.002;
	cylinder1.rotation.z += 0.002;	
	cone1.rotation.y += 0.002;	
	cone1.rotation.x += 0.002;	
	cone1.rotation.z += 0.002;	
	tetrahedron1.rotation.y += 0.002;	
	tetrahedron1.rotation.x += 0.002;	
	tetrahedron1.rotation.z += 0.002;	
	renderer.render(scene,camera);
	requestAnimationFrame(render);
}

// Wywołanie funkcji render.
render();