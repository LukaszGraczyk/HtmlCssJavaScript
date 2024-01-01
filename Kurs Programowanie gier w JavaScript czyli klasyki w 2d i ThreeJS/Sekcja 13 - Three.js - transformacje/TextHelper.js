import * as THREE from 'three';
import { FontLoader } from './FontLoader.js';       // FontLoader umożliwia wczytywanie czcionki.
import { TextGeometry } from './TextGeometry.js';   // TextGeometry umożliwia tworzenie czcionki 3D.

class TextHelper {

    // Funkcja strzałkowa tworząca obiekt będący sześcianem.
    create3dText = ({
        str = "Bryla",
        font = "./helvetiker_bold.typeface.json",   // Wczytanie pliku czcionki w katalogu głównym.
        color = 0xffd500,
        size = 0.2,
        height = 0.2,
        curveSegments = 22,
        callbackReady 
    } = {} ) => {        
        
        if (!this.fontLoader) {
            this.fontLoader = new FontLoader();
        }

        this.fontLoader.load(
            font,

            // onLoad callback
            function ( font ) {
                console.log("font załadowany");

                const textGeometry = new TextGeometry(
                    str, {
                        font: font,
                        size: size,     // Wielkość czcionki
                        height: height, // Wysokość czcionki
                        curveSegments: curveSegments
                    }
                );

                const fontMaterial = new THREE.MeshPhongMaterial({
                    color: color
                });

                const text3d = new THREE.Mesh(textGeometry,fontMaterial);

                callbackReady(text3d);
            },

            function (xhr) {
                // Postęp ładowania
            },

            function (err) {
                console.log("Błąd ładowania czcionki", err);
            }
        );
    }
}

export { TextHelper }; // Zapis konieczny jeżeli chcemy importować klasę do innego pliku.