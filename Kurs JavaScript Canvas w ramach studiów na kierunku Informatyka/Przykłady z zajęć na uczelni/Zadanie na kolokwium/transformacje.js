
//TRANSFORMACJE W PRZESTRZENI 3D
//punkty i wektory sa tablicami 3-elementowymi, np. a=[4,7,8]; lub a[0]=4; a[1]=7; a[2]=8; 

//=======================================================================================

function translate(a, b) {		//przesuniecie punktu "a" o wektor "b" (w przestrzeni 3D)
        a[0] = a[0] + b[0];
        a[1] = a[1] + b[1];
		a[2] = a[2] + b[2];
        return a;
    }
	
function translateVertex(v, b) {    //przesuniecie tablicy punktow "v" o wektor "b" (w przestrzeni 3D)
        for (i = 0; i < v.length; i++)
        { translate(v[i], b); }
        return v;
    }
		
//=========================================================================================		

function scale(a, s) {           //skalowanie (powiekszanie lub zmniejszanie obiektow), a=punkt (wierzcholek), s=skala
    for (var i = 0; i < a.length; i++) {
                a[i]*= s;
        }
        return a;
    }
		
function scaleVertex(v, s) {           //skalowanie (powiekszanie lub zmniejszanie obiektow), v=tablica wierzcholkow, s=skala
    for (var i = 0; i < v.length; i++) {
         v[i] = scale(v[i],s);
        }
    return v;
    }	

//=========================================================================================	

function degreesToRadians(angle) {  		//zamiana stopni na radiany
        return radians = (Math.PI / 180) * angle;
    }	
    	
//----------------------------------------------------------------------------------------

function rotateX(p,q,angle){  // obrot punktu "p" o kat "angle" wokol osi rownoleglej do osi X i przechodzacej przez punkt "q"
	 var pom=p[1];
	 var f=degreesToRadians(angle);
	 
	 p[1]= ((p[1]-q[1])*Math.cos(f)-(p[2]-q[2])*Math.sin(f))+q[1];
	 p[2]= ((pom-q[1])*Math.sin(f)+(p[2]-q[2])*Math.cos(f))+q[2];
	
	return p;
	}

function rotateXVertex(v,q,angle){	// obrot tablicy punktow "v" o kat "angle" wokol osi rownoleglej do osi X i przechodzacej przez punkt "q"
	for (var i = 0; i < v.length; i++) {
         v[i] = rotateX(v[i],q,angle);
        }
    return v;
    }	
	
//-----------------------------------------------------------------------------------------

function rotateY(p,q,angle){   // obrot punktu "p" o kat "angle" wokol osi rownoleglej do osi Y i przechodzacej przez punkt "q"
	 var pom=p[2];
	 var f=degreesToRadians(angle);
	 
	 p[2]= ((p[2]-q[2])*Math.cos(f)-(p[0]-q[0])*Math.sin(f))+q[2];
	 p[0]= ((pom-q[2])*Math.sin(f)+(p[0]-q[0])*Math.cos(f))+q[0];

	 return p;
	 }

function rotateYVertex(v,q,angle){	// obrot tablicy punktow "v" o kat "angle" wokol osi rownoleglej do osi Y i przechodzacej przez punkt "q"
	for (var i = 0; i < v.length; i++) {
         v[i] = rotateY(v[i],q,angle);
        }
    return v;
    }	

//------------------------------------------------------------------------------------------
	
function rotateZ(p,q,angle){	// obrot punktu "p" o kat "angle" wokol osi rownoleglej do osi Z i przechodzacej przez punkt "q"
	 var pom=p[0];
	 var f=degreesToRadians(angle);
	 
	 p[0]= ((p[0]-q[0])*Math.cos(f)-(p[1]-q[1])*Math.sin(f))+q[0];
	 p[1]= ((pom-q[0])*Math.sin(f)+(p[1]-q[1])*Math.cos(f))+q[1];

	 return p;
    }

function rotateZVertex(v,q,angle){	// obrot tablicy punktow "v" o kat "angle" wokol osi rownoleglej do osi Z i przechodzacej przez punkt "q"
	for (var i = 0; i < v.length; i++) {
         v[i] = rotateZ(v[i],q,angle);
        }
    return v;
    }	
//-----------------------------------------------------------------------------------------	

function rotate( P, A, B, angle){   //obrot punktu P wokol prostej przechodzacej przez punkty A i B
     var r,R,sina,cosa,sinb,cosb,tmp;
     if(A[0]==B[0] & A[1]==B[1]) //jesli prosta || OZ
			P=rotateZ(P,A,angle);
     else
		if(A[0]==B[0] & A[2]==B[2])//jesli prosta || OY
			P=rotateY(P,A,angle);
     else
		if(A[1]==B[1] & A[2]==B[2])//jesli prosta || OX
			P=rotateX(P,A,angle);
     else {
		var C=[B[0]-A[0],B[1]-A[1],B[2]-A[2]];
		r=Math.sqrt(C[0]*C[0] + C[1]*C[1]);
		R=Math.sqrt(C[0]*C[0] + C[1]*C[1] + C[2]*C[2]);
		sina=C[1]/r;
		cosa=C[0]/r;
		sinb=C[2]/R;
		cosb=r/R;

		P[0]=P[0]-A[0];  P[1]=P[1]-A[1];  P[2]=P[2]-A[2];

		tmp=P[0];
		P[0]=P[0]*cosa + P[1]*sina;
		P[1]=-tmp*sina + P[1]*cosa;

		tmp=P[0];
		P[0]=P[0]*cosb + P[2]*sinb;
		P[2]=-tmp*sinb + P[2]*cosb;

		P=rotateX(P,[0,0,0],angle);

		tmp=P[0];
		P[0]=P[0]*cosb - P[2]*sinb;
		P[2]=tmp*sinb + P[2]*cosb;

		tmp=P[0];
		P[0]=P[0]*cosa - P[1]*sina;
		P[1]=tmp*sina + P[1]*cosa;

		P[0]=P[0]+A[0];  P[1]=P[1]+A[1];  P[2]=P[2]+A[2];
		}
    return P;
    }
	
function rotateVertex(v,A,B,angle){	// obrot tablicy punktow "v" o kat "angle" wokol osi (prostej) przechodzacej przez punkty "A", "B"
	for (var i = 0; i < v.length; i++) {
         v[i] = rotate(v[i],A,B,angle);
        }
    return v;
    }		

//======================================================================================	
// RZUTOWANIE PERSPEKTYWICZNE

var E = [320, 240]; 		// srodek plotna, polozenie obserwatora
	var d=700;					// d = ogniskowa (odleglosc obserwatora od rzutni)
    
function projectXY(p, d) {	// rzut perspektywiczny na plaszczyzne XY, 
								// obrazem punktu p (w przestrzeni) jest punkt q (na plaszczyznie)
 var q = [];
 q[0] = (p[0]-E[0]) * d / (d + p[2]) + E[0];
 q[1] = (p[1]-E[1]) * d / (d + p[2]) + E[1];
 return q;
}

//========================================================================================

// RZUTOWANIE ROWNOLEGLE

function projectCabiniet(p, angle){  // rzut rownolegly gabinetowy (p= rzutowany punkt, angle = kat, parametr rzutu)
									// typowo przyjmuje sie kat "angle" rowny 30° lub 45°
 angle = (Math.PI / 180) * angle;  // zamiana stopni na radiany
 var q = [];
 q[0] = p[0] + 0.5 * p[2] * Math.cos(angle);
 q[1] = p[1] - 0.5 * p[2] * Math.sin(angle);

return q;
}
