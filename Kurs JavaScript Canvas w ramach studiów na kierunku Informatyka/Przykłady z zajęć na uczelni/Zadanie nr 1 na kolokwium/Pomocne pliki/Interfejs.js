// Obsługa klawiatury
//Przykład (transformujemy punkty z tablicy "cube")

function keyDownHandler(e) 			//zdarzenia przypisane do klawiszy
    {											//przesunięcia (translacje) obiektów
        
		e = e || event;
        var keyCode = e.keyCode,
    letter = (String.fromCharCode(e.keyCode) || '').toLowerCase();
    
        if (37 == keyCode) {			//strzałka w lewo
            translateVertex(cube, [-10, 0,0]);
            clear_canvas();
			drawCube(); 
        }
        if (38 == keyCode) {      //strzałka w górę
            translateVertex(cube, [0, -10,0]);
            clear_canvas();
			drawCube();
        }
        if (39 == keyCode) {    //strzałka w prawo
            translateVertex(cube, [10, 0,0]);
            clear_canvas();
			drawCube();
        }
        if (40 == keyCode) {  //strzałka w dół
            translateVertex(cube, [0, 10,0]);
            clear_canvas();
			drawCube();
        }
		 if (33 == keyCode) {  //[page up]  (zbliĹĽanie)
            translateVertex(cube, [0, 0,-10]);
            clear_canvas();
			drawCube();
        }
		 if (34 == keyCode) {  //[page down] (oddalanie)
            translateVertex(cube, [0, 0,10]);
            clear_canvas();
			drawCube();
        }
		if (88== keyCode) {  //[X] - obrót
            rotateCubeX();
        }
		if (89 == keyCode) {  //[Y] - obrót
            rotateCubeY();
        }
		if (90 == keyCode) {  //[Z] - obrót
            rotateCubeZ();
        } 
        return false;
    }
//należy pamiętać aby w dokumencie HTML znaczniku otwierającym "body" wpisać:
//  <body onkeydown="keyDownHandler(event)"> 		<!-- ustalenie obsługi zdarzeń po wciśnięciu klawiszy -->

//===============================================================
// Transformacje animowane

var play;  // zmienna do obłsugi animacji (wywoływane są funkcje co ustalony przedział czasowy)

function startAnimation(){
play=setInterval('nazwa_funkcji()',100);  // co 100 milisekund wywoływana jest funkcja "nazwa_funckcji()"
}
function stopAnimation(){				// zatrzymuje animację obsługiwaną przez zmienną "play"
clearInterval(play);
}

//można uruchamiać kilka niezależnych od siebie animacji (każda obsługiwana przez inną zmienną)
