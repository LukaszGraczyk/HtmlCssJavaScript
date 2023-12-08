 var canvas;     //zmienne "płótno"
    var c;

function clear_canvas() {		  //czyszczenie płótna
        canvas = document.getElementById("canvas");
        if (!canvas.getContext) { return; }
        c = canvas.getContext("2d");
        c.clearRect(0, 0, canvas.width, canvas.height);
	}
	
function line(a, b, style) {	        //rysowanie (na płaszczyźnie XY) odcinka o końcach a i b w zadanym kolorze
        canvas = document.getElementById("canvas");
        if (!canvas.getContext) { return; }
        c = canvas.getContext("2d");
        c.beginPath();
        c.moveTo(a[0], a[1]);
        c.lineTo(b[0], b[1]);
        c.strokeStyle = style || "rgb(200,0,0)";
        c.stroke();
    }
	
var E = [320, 240]; 		// środek płótna, położenie obserwatora
	var d=700;					// d = ogniskowa (odległość obserwatora od rzutni)
    
function projectXY(p, d) {	// rzut perspektywiczny na płaszczyznę XY, 
								// obrazem punktu p (w przestrzeni) jest punkt q (na płaszczyźnie)
 var q = [];
 q[0] = (p[0]-E[0]) * d / (d + p[2]) + E[0];
 q[1] = (p[1]-E[1]) * d / (d + p[2]) + E[1];
 return q;
}
    
	// aby połączyć krawędzią punkty w przestrzeni trójwymiarowej najpierw należy je zrzutować na płaszczyznę,
    // a następnie narysować odcinek wykorzystując funkcję "line"
	
	function line3D(a, b, color) {  					 //rysowanie odcinka o końcach a i b w zadanym kolorze
		line(projectXY(a,d), projectXY(b,d), color);	 //punkty a i b położone są w przestrzeni 3D (XYZ)
	 }	
	 
function scale(a, s) {           //skalowanie (powiększanie lub zmniejszanie obiektów), a=punkt (wierzchołek), s=skala
    for (var i = 0; i < a.length; i++) {
                a[i]*= s;
        }
        return a;
    }
		
function scaleVertex(v, s) {           //skalowanie (powiększanie lub zmniejszanie obiektów), v=tablica wierzchołków, s=skala
    for (var i = 0; i < v.length; i++) {
         v[i] = scale(v[i],s);
        }
    return v;
    }	
								//deklaracja i zdefiniowanie kostki
    var cube = scaleVertex([			//wierzchołki kostki (sześcian), powiększenie 200 razy
        [1, 1, 1], //góra         przy takim powiększeniu odcinek o długości 1 będzie miał długość 200 pikseli
		[2, 1, 1],
        [2, 1, 2], 
		[1, 1, 2],
		
		[1, 2, 1], //dół
		[2, 2, 1],
        [2, 2, 2], 
		[1, 2, 2],
    ], 200);

   
    function drawCube() {				//rysowanie kostki
        for (var i = 0; i < 3; i++) {				//połączenie krawędziami górnych wierzchołków (niebieskie)
            line3D(cube[i], cube[i + 1], "blue");}
			
        line3D(cube[3], cube[0], "blue");
		
		for (var i = 4; i < 7; i++) {       		//połączenie krawędziami dolnych wierzchołków (czerwone)
            line3D(cube[i], cube[i + 1],"red");}
			
        line3D(cube[7], cube[4], "red");
		
		for (var i = 0; i < 4; i++) {     			//rysowanie krawędzi pionowych (zielone)
            line3D(cube[i], cube[i + 4], "green");}
		
		
    }
	
	//dobrze jest narysować obiekt 3D (lub 2D) na papierze w kratkę,
	//ułatwia to poprawne podanie wpółrzędnych wierzchołków
	//można przyjąć, że 1 kratka jest jednostką (czyli tutaj 200 pikseli)