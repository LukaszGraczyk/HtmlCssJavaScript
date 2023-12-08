var canvas;     // Deklaracja obiektu "płótno" 
var c;          // Na płótnie wyświetlana jest grafika

/* Funkcja czyszcząca płótno */
function cleanCanvas() {
    canvas = document.getElementById("canvas");
    if (!canvas.getContext) { return; }
    c = canvas.getContext("2d");
    c.clearRect(0, 0, canvas.width, canvas.height);
}

var d=700;                  // Ogniskowa (odległość obserwatora od rzutni)
var E = [400, 300, -d];     // Położenie obserwatora

/* Rzutowanie perspektywiczne, gdzie obrazem punktu p (w przestrzeni 3D) jest punkt q (na płaszczyźnie XY) */
function projectXY(p,d) {
    var q = [];
    q[0] = (p[0]-E[0]) * d / (d + p[2]) + E[0];
    q[1] = (p[1]-E[1]) * d / (d + p[2]) + E[1];
    return q;
}

/* Rysowanie odcinka w 2 wymiarach z punktu a do punktu b w zadanym kolorze */
function line(a, b, style) { 
canvas = document.getElementById("canvas");
if (!canvas.getContext) { return; }
c = canvas.getContext("2d");
c.lineWidth = 2;
c.beginPath();
c.moveTo(a[0], a[1]);
c.lineTo(b[0], b[1]);
c.strokeStyle = style || "rgb(200,0,0)";
c.stroke();
}

/* Rysowanie odcinka w 3 wymiarach z punktu a do punktu b z rzutowaniem */
function line3D(a, b, color) {
    line(projectXY(a,d),
    projectXY(b,d), color);
}

/* Sklalowanie skalą s obrazu, jakim jest punkt q będący rzutem na płaszczyźnie XY punktu p z przestrzni 3D */
/* Skalowanie odbywa się względem punktu a, którego współrzędne podawane są dla przestrzeni 3D */
function scale(p,a,s) {
    var q=[];
    for (var j = 0; j < p.length; j++)
    q[j] = (p[j]-a[j])*s + a[j];
    return q;
}

/* Sklalowanie skalą s obrazu, jakim jest zbiór punktów w będący rzutem na płaszczyźnie XY punktów v z przestrzni 3D */
/* Skalowanie odbywa się względem punktu a */
function scaleArray(v,a,s) {
    var w=[];
    for (var i = 0; i < v.length; i++)
    w[i]=scale(v[i],a,s);
    return w;
}

/* Funkcja zmieniająca współrzędne punktu p poprzez dodanie do nich współrzędnych punktu u. */
function translate(p, u) { 
    var q=[]; 
    for (var j = 0; j < p.length; j++) q[j] = p[j]+u[j];  
    return q; 
} 

/* Funkcja zmieniająca współrzędne punktów w tablicy v poprzez dodanie do nich współrzędnych punktu u. */
function translateArray(v, u) { 
    var w=[]; 
    for (i = 0; i < v.length; i++) 
    w[i]=translate(v[i], u);  
    return w;
}  

/* Funkcja zamieniająca stopnie na radiany */
function degreesToRadians(angle) { 
    return radians = (Math.PI / 180) * angle;
}

/* Obrót punktu "p" o kąt "angle" wokół prostej równoległej do osi X i przechodzącej przez punkt "q" */
function rotateX(p,a,angle) { 
    var q=[]; 
    var f=degreesToRadians(angle); 
    q[0]= p[0]; 
    q[1]= ((p[1]-a[1])*Math.cos(f)-(p[2]-a[2])*Math.sin(f)) + a[1]; 
    q[2]= ((p[1]-a[1])*Math.sin(f)+(p[2]-a[2])*Math.cos(f)) + a[2];  
    return q; 
}  

/* Obrót punktu "p" o kąt "angle" wokół prostej równoległej do osi Y i przechodzącej przez punkt "q" */
function rotateY(p,a,angle) { 
    var q=[]; 
    var f=degreesToRadians(angle); 
    q[0]= ((p[2]-a[2])*Math.sin(f)+(p[0]-a[0])*Math.cos(f))+a[0]; 
    q[1]= p[1]; q[2]= ((p[2]-a[2])*Math.cos(f)-(p[0]-a[0])*Math.sin(f))+a[2];  
    return q; 
}  

/* Obrót punktu "p" o kąt "angle" wokół prostej równoległej do osi Z i przechodzącej przez punkt "q" */
function rotateZ(p,a,angle) { 
    var q=[]; 
    var f=degreesToRadians(angle); 
    q[0]= ((p[0]-a[0])*Math.cos(f)-(p[1]-a[1])*Math.sin(f))+a[0]; 
    q[1]= ((p[0]-a[0])*Math.sin(f)+(p[1]-a[1])*Math.cos(f))+a[1]; 
    q[2]= p[2];  
    return q; 
}   

/* Rotacja tablicy "v" punktów o kont "angle" do okoła osi "axis" przechodzącej przez punkt "a" */
/* Przyjęto axis==0 dla osi X, axis==1 dla osi Y oraz axis==2 sla osi Z */
/* Wynikiem jest nowa tablica "w" obróconych punktów */
/* Współrzędne punktu "a" są podawane dla 3 wymiarów */
function rotateArray(v,a,angle,axis) { 
    var w=[]; 
    if(axis==0) {
        for (i = 0; i < v.length; i++) 
        w[i]=rotateX(v[i],a, angle);
    }
    if(axis==1) {
        for (i = 0; i < v.length; i++) 
        w[i]=rotateY(v[i],a, angle);
    }
    if(axis==2) {
        for (i = 0; i < v.length; i++) 
        w[i]=rotateZ(v[i],a, angle);
    } 
    return w; 
}    

/* Obiekt nr 1 - śmigło duże */
var cube = [
    [1, 2, 3], [2, 2, 3], [2, 2, 4], [1, 2, 4],  [1, 2, 3], [2, 2, 3], [2, 2, 4], [1, 2, 4], // Środek obrotu to punkt [1.5, 2, 3.5]
    [-1,1.7,3], [-1,1.7,4], [-1,2,4], [-1,2,3],
    [4,1.7,3], [4,1.7,4], [4,2,4], [4,2,3],
    [1, 1.7, 1], [2, 1.7, 1], [1, 2, 1], [2, 2, 1],
    [2, 1.7, 6], [1, 1.7, 6], [2, 2, 6], [1, 2, 6],
    ];

// Środek obrotu dużego śmigła to punkt [1.5, 2, 3.5], a więc musimy sprawić żeby pokrywał się on z czubkiem rdzenia wirnika.
// Musimy zatem przesunąć śmigło do punktu [1.5, 2, 2.5], który to punkt jest czubkiem rdzenia wirnika.
cube = translateArray(cube, [0,0,-1]);

var v = translateArray(scaleArray(cube, [1.5,1.5,1.5],100),[450,450,200]);   // Skalowanie i przesunięcie obiektu żeby był dobrze widoczny na ekranie 

/* Funkcja rysująca statyczny obiekt nr 1 */
function drawObject(v) {  
    
    /* Rdzeń wirnika śmigła dużego */
    for (var i = 0; i < 3; i++) { line3D(v[i], v[i + 1],"green"); }  
    line3D(v[3], v[0],"green");   
    for (var i = 4; i < 7; i++) { line3D(v[i], v[i + 1],"green"); }  
    line3D(v[7], v[4],"green");   
    for (var i = 0; i < 4; i++) { line3D(v[i], v[i + 4],"green"); }  
    
    /* Łopatka śmigła dużego nr 1 */
    for (var i = 8; i < 11; i++) { line3D(v[i], v[i + 1],"green"); } 
    line3D(v[11],v[8],"green");
    line3D(v[0],v[8],"coral"); 
    line3D(v[3],v[9],"coral"); 
    line3D(v[7],v[10],"coral"); 
    line3D(v[4],v[11],"coral");  
    
    /* Łopatka śmigła dużego nr 2 */
    for (var i = 12; i < 15; i++) { line3D(v[i], v[i + 1],"green"); } 
    line3D(v[15],v[12],"green");  
    line3D(v[1],v[12],"coral"); 
    line3D(v[2],v[13],"coral"); 
    line3D(v[6],v[14],"coral"); 
    line3D(v[5],v[15],"coral");  
    
    /* Łopatka śmigła dużego nr 3 */
    line3D(v[19],v[18],"green");  
    line3D(v[19],v[17],"green");  
    line3D(v[16],v[17],"green");  
    line3D(v[16],v[18],"green");  
    line3D(v[0],v[16],"coral"); 
    line3D(v[1],v[17],"coral"); 
    line3D(v[7],v[18],"coral"); 
    line3D(v[6],v[19],"coral"); 
    
    /* Łopatka śmigła dużego nr 4 */
    line3D(v[23],v[22],"green");  
    line3D(v[23],v[21],"green");  
    line3D(v[20],v[21],"green");  
    line3D(v[20],v[22],"green");  
    line3D(v[2],v[20],"coral"); 
    line3D(v[3],v[21],"coral"); 
    line3D(v[5],v[22],"coral"); 
    line3D(v[4],v[23],"coral");

    /* Przez przecięcie tych linii przechodzi oś obrotu wirnika równoległa do osi Y */
    line3D(v[4],v[6],"coral"); 
    line3D(v[5],v[7],"coral"); 
    
}  

/* Obiekt nr 2 - szkielet helikoptera */
var cube2 = [
[1.5, 2, 2.5], [1.5, 2.5, 2.5], // Rdzeń wirnika śmigła dużego (biały)
[1, 3, 3], [2, 3, 3], [1, 3, 2], [2, 3, 2], // Podstawa łącznik rdzenia wirnika ze szkieletem helikoptere (niebieski)
[0, 3, 4], [3, 3, 4], [0, 3, 1], [3, 3, 1], // Dach helikoptera (czarny)
[0, 4, 4], [3, 4, 4], [0, 4, 1], [3, 4, 1], // Podwozie (szary)
[-3, 3, 2.5], // Ogon helikoptera (purpurowy)
[-3, 3, 2], // Rdzeń wirnika śmigła małego (biały)
[5, 4, 2.5], // Kadłub (purpurowy)
[0.5, 4.5, 4], [2.5, 4.5, 4], [0.5, 4.5, 1], [2.5, 4.5, 1], // Płozy (szary)
];  
var w = translateArray(scaleArray(cube2, [1.5,1.5,1.5],100),[450,450,200]);  // Skalowanie i przesunięcie obiektu żeby był dobrze widoczny na ekranie 

/* Funkcja rysująca statyczny obiekt nr 2 */
function drawW() {  
    
    // Rdzeń wirnika śmigła dużego (biały)
    line3D(w[0],w[1],"white");  
    
    // Podstawa łącznik rdzenia wirnika ze szkieletem helikoptere (niebieski)
    line3D(w[2],w[3],"blue");  
    line3D(w[3],w[5],"blue");  
    line3D(w[5],w[4],"blue");  
    line3D(w[2],w[4],"blue");
    
    // Łącznik rdzenia wirnika ze szkieletem helikoptere (czerwony) 
    line3D(w[1],w[2],"red"); 
    line3D(w[1],w[3],"red"); 
    line3D(w[1],w[4],"red"); 
    line3D(w[1],w[5],"red");

    // Dach helikoptera (czarny)
    line3D(w[6],w[7],"black");  
    line3D(w[7],w[9],"black");  
    line3D(w[9],w[8],"black");  
    line3D(w[6],w[8],"black");

    // Podwozie (szary)
    line3D(w[10],w[11],"grey");  
    line3D(w[11],w[13],"grey");  
    line3D(w[13],w[12],"grey");  
    line3D(w[10],w[12],"grey");

    // Ściany kabiny (szary)
    line3D(w[6],w[10],"green");  
    line3D(w[7],w[11],"green");  
    line3D(w[9],w[13],"green");  
    line3D(w[8],w[12],"green");

    // Ogon helikoptera
    line3D(w[14],w[12],"purple");
    line3D(w[14],w[10],"purple");
    line3D(w[14],w[8],"purple");
    line3D(w[14],w[6],"purple");

    // Rdzeń wirnika śmigła małego (biały)
    line3D(w[14],w[15],"white");

    // Kadłub (purpurowy)
    line3D(w[16],w[7],"purple");
    line3D(w[16],w[9],"purple");
    line3D(w[16],w[13],"purple");
    line3D(w[16],w[11],"purple");

    // Płozy (szary)
    line3D(w[17],w[18],"orange");   
    line3D(w[20],w[19],"orange");
    line3D(w[19],w[12],"orange");
    line3D(w[17],w[10],"orange");
}   

/* Obiekt nr 3 - śmigło małe */
var cube3 = [
    [1, 1.7, 3], [2, 1.7, 3], [2, 1.7, 4], [1, 1.7, 4],  [1, 2, 3], [2, 2, 3], [2, 2, 4], [1, 2, 4],
    [0.5,1.7,3], [0.5,1.7,4], [0.5,2,4], [0.5,2,3],
    [2.5,1.7,3], [2.5,1.7,4], [2.5,2,4], [2.5,2,3],
    [1, 1.7, 2.5], [2, 1.7, 2.5], [1, 2, 2.5], [2, 2, 2.5],
    [2, 1.7, 4.5], [1, 1.7, 4.5], [2, 2, 4.5], [1, 2, 4.5],
];

// Środek obrotu małego śmigła to początkowo punkt [1.5, 2, 3.5], a więc musimy sprawić żeby pokrywał się on z czubkiem rdzenia wirnika śmigła dużego.
// Musimy zatem przesunąć śmigło małe do punktu [1.5, 2, 2.5], który to punkt jest czubkiem rdzenia wirnika śmigła dużego.
cube3 = translateArray(cube3, [0,0,-1]);

// Teraz oba śmigła się pokrywają i należy przenieść śmigło małe do czubka rdzenia na ogonie helikoptera.
// Koniec rdzenia wirnika śmigła małego to punkt [-3, 3, 2], a więc dokonujemy przesunięcia.
cube3 = translateArray(cube3, [-4.5,1,-0.5]);

// Obracamy śmigło małe względem końca rdzenia wirnika o kąt 90 stopni względem osi równoległej do osi X.
cube3 = rotateArray(cube3,[-3, 3, 2],90,0);

var vv = translateArray(scaleArray(cube3, [1.5,1.5,1.5],100),[450,450,200]); // Skalowanie i przesunięcie obiektu żeby był dobrze widoczny na ekranie 



/* Funkcja rysująca obiekt nr 3 */
function drawObject(vv) {  
    
    /* Rdzeń wirnika śmigła małego */
    for (var i = 0; i < 3; i++) { line3D(vv[i], vv[i + 1],"green"); }  
    line3D(vv[3], vv[0],"green");   
    for (var i = 4; i < 7; i++) { line3D(vv[i], vv[i + 1],"green"); }  
    line3D(vv[7], vv[4],"green");   
    for (var i = 0; i < 4; i++) { line3D(vv[i], vv[i + 4],"green"); }  
    
    /* Łopatka śmigła małego nr 1 */
    for (var i = 8; i < 11; i++) { line3D(vv[i], vv[i + 1],"green"); } 
    line3D(vv[11],vv[8],"green");
    line3D(vv[0],vv[8],"coral"); 
    line3D(vv[3],vv[9],"coral"); 
    line3D(vv[7],vv[10],"coral"); 
    line3D(vv[4],vv[11],"coral");  
    
    /* Łopatka śmigła małego nr 2 */
    for (var i = 12; i < 15; i++) { line3D(vv[i], vv[i + 1],"green"); } 
    line3D(vv[15],vv[12],"green");  
    line3D(vv[1],vv[12],"coral"); 
    line3D(vv[2],vv[13],"coral"); 
    line3D(vv[6],vv[14],"coral"); 
    line3D(vv[5],vv[15],"coral");  
    
    /* Łopatka śmigła małego nr 3 */
    line3D(vv[19],vv[18],"green");  
    line3D(vv[19],vv[17],"green");  
    line3D(vv[16],vv[17],"green");  
    line3D(vv[16],vv[18],"green");  
    line3D(vv[0],vv[16],"coral"); 
    line3D(vv[1],vv[17],"coral"); 
    line3D(vv[7],vv[18],"coral"); 
    line3D(vv[6],vv[19],"coral"); 
    
    /* Łopatka śmigła małego nr 4 */
    line3D(vv[23],vv[22],"green");  
    line3D(vv[23],vv[21],"green");  
    line3D(vv[20],vv[21],"green");  
    line3D(vv[20],vv[22],"green");  
    line3D(vv[2],vv[20],"coral"); 
    line3D(vv[3],vv[21],"coral"); 
    line3D(vv[5],vv[22],"coral"); 
    line3D(vv[4],vv[23],"coral");

    /* Przez przecięcie tych linii przechodzi oś obrotu wirnika równoległa do osi Y */
    /* Powyższe stwierdzenie tyczy się sytuacji gdy tablica cube 3 nie jest jeszcze obrócona o 90 stopni */
    line3D(vv[4],vv[6],"coral"); 
    line3D(vv[5],vv[7],"coral"); 
    
}

/* Funkcja czyszcząca canvas i następnie rysująca statyczne obiekty nr 1 i nr 2 */
function draw() { 
    cleanCanvas(); 
    drawW(); 
    drawObject(v);
    drawObject(vv); 
}    

/* Funkcja obracająca obiekt nr 1 i rysująca obiekt nr 1 i obiekt nr 2 */
function rotateObject(angle, axis) { 
    var q=[(v[0][0]+v[6][0])/2,(v[0][1]+v[6][1])/2,(v[0][2]+v[6][2])/2];    // Punkt w 3D przez który przechodzi oś obrotu axis 
    v=rotateArray(v, q, angle, axis);                                       // Funkcja obracająca tablicą punktów tworzących obiekt nr 1
    draw();                                                                 // Funkcja rysująca obiekt nr 1 oraz obiekt nr 2
}  

function rotateObject3(angle, axis) { 
    var q=[(vv[0][0]+vv[6][0])/2,(vv[0][1]+vv[6][1])/2,(vv[0][2]+vv[6][2])/2];    // Punkt w 3D przez który przechodzi oś obrotu axis 
    vv=rotateArray(vv, q, angle, axis);                                       // Funkcja obracająca tablicą punktów tworzących obiekt nr 1
    draw();                                                                 // Funkcja rysująca obiekt nr 1 oraz obiekt nr 2
}  

var rotX,rotY,rotZ;  // Animacje z ustaleniem przedziału czasowego (time interval)

/* Funkcja kasująca cykliczne animacje wykorzystujące interwał czasowy */
function stopAnimation() { 
    clearInterval(rotX); 
    clearInterval(rotY); 
    clearInterval(rotZ); 
}  

/* Funkcja wywołująca na ekran animacje rotacji obiektu nr 1 do okoła osi X */
/* Funkcja ta wywołuje też na ekran statyczny obiekt nr 2 */
function startRotationX() { 
    stopAnimation(); 
    rotX = setInterval('rotateObject(-6,0)', 50); // "-6" oznacza sześć stopni przeciwnie do ruchu zegara, "0" oznacza oś X, "50" to milisekundy interwału
} 

/* Funkcja wywołująca na ekran animacje rotacji obiektu nr 1 do okoła osi Y */
/* Funkcja ta wywołuje też na ekran statyczny obiekt nr 2 */
function startRotationY() { 
    stopAnimation(); 
    rotY = setInterval('rotateObject(-6,1)', 50); 
} 

/* Funkcja wywołująca na ekran animacje rotacji obiektu nr 1 do okoła osi Z */
/* Funkcja ta wywołuje też na ekran statyczny obiekt nr 2 */
function startRotationZ() { 
    stopAnimation(); 
    rotZ = setInterval('rotateObject(-6,2)', 50); 
}   

/* Rotacja obiektu nr 3 czyli małego śmigła */
function startRotationZ3() { 
    stopAnimation(); 
    rotZ = setInterval('rotateObject3(-6,2)', 50); 
}

/* Rotacja dwóch śmigieł jednocześnie */
function startRotationYZ3() { 
    stopAnimation(); 
    rotY = setInterval('rotateObject(-6,1)', 50); 
    rotZ = setInterval('rotateObject3(-6,2)', 50); 
}

/* Wywołująca na ekran obraz obiektu nr 1 w skali s */
/* Skalowanie odbywa się względem punktu q o współrzędnych dla przestrzeni 3D */
function scaleObject(s) { 
    var q=[(v[0][0]+v[6][0])/2,(v[0][1]+v[6][1])/2,(v[0][2]+v[6][2])/2]; // Środek wirnika, czyli punkt q względem którego skalujemy
    v = scaleArray(v, q, s); 
    draw(); 
}   

function keyDownHandler(e) {   // Funkcja przypisująca zdarzenia do klawiszy // Sterowanie kwadratem za pomoca klawiatury

    /* Zdażenie event wstawione jako argument wywoła funkcję keyDown */
    /* W naszym przypadku zdażeniem będzie zwolnienie wciśniętego przycisku strzałki */

    e = e || event; 
    var keyCode = e.keyCode, letter = (String.fromCharCode(e.keyCode) || '').toLowerCase();  
    if (37 == keyCode) {w = translateArray(w, [-10, 0,0]); draw();} // JavaScript Key Code dla strzałki w lewo na klawiaturze to 37
    if (38 == keyCode) {w = translateArray(w, [0, -10,0]); draw();} 
    if (39 == keyCode) {w = translateArray(w, [10, 0,0]); draw();} 
    if (40 == keyCode) {w = translateArray(w, [0, 10,0]); draw();} 
    if (33 == keyCode) {w = translateArray(w, [0, 0,-10]); draw();} 
    if (34 == keyCode) {w = translateArray(w, [0, 0,10]); draw();}  
    return false; 
}   

/* Funkcja przywracająca obraz obiektów nr 1 i nr 2 do widoku początkowego */
function restoreSettings() { 
    stopAnimation(); 
    v = translateArray(scaleArray(cube, [1.5,1.5,1.5],100),[450,450,200]); 
    w = translateArray(scaleArray(cube2, [1.5,1.5,1.5],100),[450,450,200]);
    vv = translateArray(scaleArray(cube3, [1.5,1.5,1.5],100),[450,450,200]);
    d=700; 
    draw(); 
}  

/* Funkcja przybliżająca wyświetlany obraz obiektów poprzez zmianę ogniskowej, czyli odległości obserwatora od rzutni */
function focalPlus() { 
    stopAnimation(); 
    if(d<3000){ d=d+100;} 
    draw(); 
} 

/* Funkcja oddalająca wyświetlany obraz obiektów poprzez zmianę ogniskowej, czyli odległości obserwatora od rzutni */
function focalMinus() { 
    stopAnimation(); 
    if(d>100){d=d-100;} 
    draw(); 
} 