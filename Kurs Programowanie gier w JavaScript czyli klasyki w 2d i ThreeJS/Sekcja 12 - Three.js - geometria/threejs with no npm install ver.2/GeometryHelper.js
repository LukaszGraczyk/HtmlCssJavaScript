import * as THREE from 'three';

class GeometryHelper {

    // Funkcja strzałkowa tworząca obiekt będący sześcianem.
    createCube = ({
        width = 1,
        height = 1,
        depth = 1,
        numSegments = 3,    // Ilość segmentów na każdą za ścian sześcianu 
        color = 0x00ff00,
        wireframe = false   // Renderer maluje lub nie tylko linie składające się na sześcian bez wypełnienia.
    } = {} ) => {           // Dodanie pustych nawiasów klamrowych po znaku "=" powoduje możliwość użycia wartości domyślnych.
        
        // Sześcian o określonych parametrach.
        let geometry = new THREE.BoxGeometry(   // BoxGeometry() to predefiniowana klasa do tworzenia sześcianów.
            width,
            height,
            depth,
            numSegments,    // Ilość segmentów na osi x
            numSegments,    // Ilość segmentów na osi y
            numSegments     // Ilość segmentów na osi z   
        );

        // Kolor inne właściwości materiału.
        let material = new THREE.MeshBasicMaterial({
            color: color,
            wireframe: wireframe
        });

        // Siatka Mesh, na której montujemy geometrię i materiał.
        return new THREE.Mesh(geometry,material);
    }

    /**************************************************************************************************************************************/

    // Funkcja strzałkowa tworząca obiekt będący sferą.
    createSphere = ({
        radius = 0.8,         // Promień sfery
        widthSegments = 20,
        heighSegments = 20,
        color = 0x00ff00,
        wireframe = false
    } = {} ) => {           // Dodanie pustych nawiasów klamrowych po znaku "=" powoduje możliwość użycia wartości domyślnych.
        
        // Sfera o określonych parametrach.
        let geometry = new THREE.SphereGeometry(   // SphereGeometry() to predefiniowana klasa do tworzenia sfer.
            radius,
            widthSegments,
            heighSegments 
        );

        // Kolor inne właściwości materiału.
        let material = new THREE.MeshBasicMaterial({
            color: color,
            wireframe: wireframe
        });

        // Siatka Mesh, na której montujemy geometrię i materiał.
        return new THREE.Mesh(geometry,material);
    }

    /**************************************************************************************************************************************/

    // Funkcja strzałkowa tworząca obiekt będący cylindrem.
    createCylinder = ({
        radiusTop = 0.4,         // Promień górnej podstawy
        radiusBottom = 0.4,      // Promień dolnej podstawy
        height = 1.4,            // Wysokość cylindra
        radialSegments = 40,
        heightSegments = 4,
        color = 0x0000ff,
        wireframe = false
    } = {} ) => {           // Dodanie pustych nawiasów klamrowych po znaku "=" powoduje możliwość użycia wartości domyślnych.
                
        // Cylinder o określonych parametrach.
        let geometry = new THREE.CylinderGeometry(   // CylinderGeometry() to predefiniowana klasa do tworzenia cylindrów.
            radiusTop,        
            radiusBottom,      
            height,  
            radialSegments,
            heightSegments
        );
        
        // Kolor inne właściwości materiału.
        let material = new THREE.MeshBasicMaterial({
            color: color,
            wireframe: wireframe
        });
        
        // Siatka Mesh, na której montujemy geometrię i materiał.
        return new THREE.Mesh(geometry,material);
    }

    /**************************************************************************************************************************************/

    // Funkcja strzałkowa tworząca obiekt będący cylindrem.
    createCone = ({
        radius = 0.7,         // Promień podstawy stożka
        height = 1.2,         // Wysokość stożka
        radialSegments = 20,
        heightSegments = 10,
        color = 0xffff00,
        wireframe = false
    } = {} ) => {           // Dodanie pustych nawiasów klamrowych po znaku "=" powoduje możliwość użycia wartości domyślnych.
                
        // Stożek o określonych parametrach.
        let geometry = new THREE.ConeGeometry(   // ConeGeometry() to predefiniowana klasa do tworzenia stożków.
            radius,         
            height,         
            radialSegments,
            heightSegments
        );
        
        // Kolor inne właściwości materiału.
        let material = new THREE.MeshBasicMaterial({
            color: color,
            wireframe: wireframe
        });
        
        // Siatka Mesh, na której montujemy geometrię i materiał.
        return new THREE.Mesh(geometry,material);
    }
}

export { GeometryHelper };