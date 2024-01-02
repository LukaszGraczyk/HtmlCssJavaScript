import * as THREE from 'three';

class GeometryHelper {

    // Funkcja strzałkowa tworząca obiekt będący sześcianem foremnym.
    createCube = ({
        width = 1,
        height = 1,
        depth = 1,
        numSegments = 3,    // Ilość segmentów na każdą za ścian sześcianu 
        color = 0x00ff00,
        wireframe = false   // Renderer maluje lub nie tylko linie składające się na sześcian bez wypełnienia.
    } = {} ) => {           
        
        // Sześcian o określonych parametrach.
        let boxGeometry = new THREE.BoxGeometry(   // BoxGeometry() to predefiniowana klasa do tworzenia sześcianów.
            width,
            height,
            depth,
            numSegments,    // Ilość segmentów na osi x
            numSegments,    // Ilość segmentów na osi y
            numSegments     // Ilość segmentów na osi z   
        );

        // Kolor inne właściwości materiału.
        let boxMaterial = new THREE.MeshBasicMaterial({
            color: color,
            wireframe: wireframe
        });

        // Siatka Mesh, na której montujemy geometrię i materiał.
        return new THREE.Mesh(boxGeometry,boxMaterial);
    }

    /**************************************************************************************************************************************/

    // Funkcja strzałkowa tworząca obiekt będący sferą.
    createSphere = ({
        radius = 0.8,         // Promień sfery
        widthSegments = 20,
        heighSegments = 20,
        color = 0x00ff00,
        wireframe = false
    } = {} ) => {           
        
        // Sfera o określonych parametrach.
        let sphereGeometry = new THREE.SphereGeometry(   // SphereGeometry() to predefiniowana klasa do tworzenia sfer.
            radius,
            widthSegments,
            heighSegments 
        );

        // Kolor inne właściwości materiału.
        let sphereMaterial = new THREE.MeshBasicMaterial({
            color: color,
            wireframe: wireframe
        });

        // Siatka Mesh, na której montujemy geometrię i materiał.
        return new THREE.Mesh(sphereGeometry,sphereMaterial);
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
    } = {} ) => {           
                
        // Cylinder o określonych parametrach.
        let cylinderGeometry = new THREE.CylinderGeometry(   // CylinderGeometry() to predefiniowana klasa do tworzenia cylindrów.
            radiusTop,        
            radiusBottom,      
            height,  
            radialSegments,
            heightSegments
        );
        
        // Kolor inne właściwości materiału.
        let cylinderMaterial = new THREE.MeshBasicMaterial({
            color: color,
            wireframe: wireframe
        });
        
        // Siatka Mesh, na której montujemy geometrię i materiał.
        return new THREE.Mesh(cylinderGeometry,cylinderMaterial);
    }

    /**************************************************************************************************************************************/

    // Funkcja strzałkowa tworząca obiekt będący stożkiem.
    createCone = ({
        radius = 0.7,         // Promień podstawy stożka
        height = 1.2,         // Wysokość stożka
        radialSegments = 20,
        heightSegments = 1,
        color = 0xffff00,
        wireframe = false
    } = {} ) => {           
                
        // Stożek o określonych parametrach.
        let coneGeometry = new THREE.ConeGeometry(   // ConeGeometry() to predefiniowana klasa do tworzenia stożków.
            radius,         
            height,         
            radialSegments,
            heightSegments
        );
        
        // Kolor inne właściwości materiału.
        let coneMaterial = new THREE.MeshBasicMaterial({
            color: color,
            wireframe: wireframe
        });
        
        // Siatka Mesh, na której montujemy geometrię i materiał.
        return new THREE.Mesh(coneGeometry,coneMaterial);
    }

    /**************************************************************************************************************************************/

    // Funkcja strzałkowa tworząca obiekt będący czworościanem foremnym.
    createTetrahedron = ({
        radius = 0.9,         
        detail = 0,         
        color = 0xc600ff,
        wireframe = false
    } = {} ) => {           
                
        // Bryła foremna o określonych parametrach.
        let tetrahedronGeometry = new THREE.TetrahedronGeometry(   
            radius,         
            detail        
        );
        
        // Kolor inne właściwości materiału.
        let tetrahedronMaterial = new THREE.MeshBasicMaterial({
            color: color,
            wireframe: wireframe
        });
        
        // Siatka Mesh, na której montujemy geometrię i materiał.
        return new THREE.Mesh(tetrahedronGeometry,tetrahedronMaterial);
    }

    /**************************************************************************************************************************************/

    // Funkcja strzałkowa tworząca obiekt będący sześcianem foremnym z teksturą.
    createTexturedCube = ({
        width = 0.5,
        height = 0.5,
        depth = 0.5
    } = {} ) => {

        let boxGeometry = new THREE.BoxGeometry(   // BoxGeometry() to predefiniowana klasa do tworzenia sześcianów.
        width = 0.5,
        height = 0.5,
        depth = 0.5
        );

        const textureLoader = new THREE.TextureLoader();
        const textureUrl = "./Assets/Textures/Cube.jpg";
        const texture1 = textureLoader.load(textureUrl);

        let cubeTextureMaterial = new THREE.MeshPhongMaterial({
            map: texture1
        });

        return new THREE.Mesh(boxGeometry,cubeTextureMaterial);
    }

    /**************************************************************************************************************************************/

    // Funkcja strzałkowa tworząca obiekt będący kulą z teksturą.
    createTexturedSphere = ({
        radius = 0.3,         // Promień sfery
        widthSegments = 20,
        heighSegments = 20
    } = {} ) => {

        let sphereGeometry = new THREE.SphereGeometry(   // SphereGeometry() to predefiniowana klasa do tworzenia sfer.
        radius,
        widthSegments,
        heighSegments 
        );

        const textureLoader = new THREE.TextureLoader();
        const textureUrl = "./Assets/Textures/Sphere.jpg";
        const texture1 = textureLoader.load(textureUrl);

        let sphereTextureMaterial = new THREE.MeshPhongMaterial({
            map: texture1
        });

        return new THREE.Mesh(sphereGeometry,sphereTextureMaterial);
    }

    /**************************************************************************************************************************************/

    // Funkcja strzałkowa tworząca obiekt będący kulą z teksturą.
    createTexturedCylinder = ({
        radiusTop = 0.2,         // Promień górnej podstawy
        radiusBottom = 0.2,      // Promień dolnej podstawy
        height = 0.7,            // Wysokość cylindra
        radialSegments = 40,
        heightSegments = 4
    } = {} ) => {

        let cylinderGeometry = new THREE.CylinderGeometry(   // CylinderGeometry() to predefiniowana klasa do tworzenia walców.
        radiusTop,        
        radiusBottom,      
        height,  
        radialSegments,
        heightSegments
        );

        const textureLoader = new THREE.TextureLoader();
        const textureUrl = "./Assets/Textures/Cylinder.jpg";
        const texture1 = textureLoader.load(textureUrl);

        let cylinderTextureMaterial = new THREE.MeshPhongMaterial({
            map: texture1
        });

        return new THREE.Mesh(cylinderGeometry,cylinderTextureMaterial);
    }

    /**************************************************************************************************************************************/

    // Funkcja strzałkowa tworząca obiekt będący kulą z teksturą.
    createTexturedCone = ({
        radius = 0.35,          // Promień podstawy stożka
        height = 0.6,           // Wysokość stożka
        radialSegments = 50,
        heightSegments = 5
    } = {} ) => {

        let coneGeometry = new THREE.ConeGeometry(   // ConeGeometry() to predefiniowana klasa do tworzenia stożków.
        radius,         
        height,         
        radialSegments,
        heightSegments
        );

        const textureLoader = new THREE.TextureLoader();
        const textureUrl = "./Assets/Textures/Cone.jpg";
        const texture1 = textureLoader.load(textureUrl);

        let coneTextureMaterial = new THREE.MeshPhongMaterial({
            map: texture1
        });

        return new THREE.Mesh(coneGeometry,coneTextureMaterial);
    }

    /**************************************************************************************************************************************/

    // Funkcja strzałkowa tworząca obiekt będący kulą z teksturą.
    createTexturedTetrahedron = ({
        radius = 0.45,         
        detail = 0
    } = {} ) => {

        let tetrahedronGeometry = new THREE.TetrahedronGeometry(   
        radius,         
        detail  
        );

        const textureLoader = new THREE.TextureLoader();
        const textureUrl = "./Assets/Textures/Tetrahedron.jpg";
        const texture1 = textureLoader.load(textureUrl);

        let tetrahedronTextureMaterial = new THREE.MeshPhongMaterial({
            map: texture1
        });

        return new THREE.Mesh(tetrahedronGeometry,tetrahedronTextureMaterial);
    }
}

export { GeometryHelper }; // Zapis konieczny jeżeli chcemy importować klasę do innego pliku.