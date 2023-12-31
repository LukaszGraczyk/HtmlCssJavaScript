// Importowanie biblioteki Three.js
import * as THREE from 'three';

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

// Umieszczenie kamery w punkcie o współrzędnych (0,0,5).
// Domyślnie kamera jest w punkcie (0,0,0).
camera.position.z = 5;

// Dodanie kamery do sceny.
scene.add(camera);

// Obiekt renderujący scenę. Za pomocą niego namalujemy na canvas naszą scenę.
// Nie musimy dodawać canvas w pliku html ponieważ Three.js tworzy go automatycznie.
let renderer = new THREE.WebGLRenderer();

// Dostosowanie canvas do szerokości i wysokości ekranu.
renderer.setSize(window.innerWidth, window.innerHeight);

// Dodanie automatyczne canvas do body.
document.body.appendChild(renderer.domElement);

// Przykładowy sześcian o bokach 1,1,1.
// BoxGeometry() to predefiniowana klasa do tworzenia sześcianów.
let geometry = new THREE.BoxGeometry(1,1,1);

// Tekstura, kolor sześcianu.
let material = new THREE.MeshBasicMaterial({
    color: 0x00ff00   
});

// Siatka Mesh, na której montujemy geometrię i materiał.
let cube = new THREE.Mesh(geometry,material);

// Dodanie bryły do sceny.
scene.add(cube);

// Automatyczne dostosowywanie się wyświetlania na canvas przy zmianie rozmiaru okna.
window.addEventListener("resize", (e) => {
    camera.aspect = window.innerWidth / window.innerHeight;
    camera.updateProjectionMatrix();
    renderer.setSize(window.innerWidth, window.innerHeight);
});

// Renderowanie sceny.
function render () {
    cube.rotation.y += 0.01;        // Rotacja bryły wokół osi y.
    renderer.render(scene,camera);
    requestAnimationFrame(render);
}

render();