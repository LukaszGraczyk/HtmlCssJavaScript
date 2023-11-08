const btn = document.querySelector('.btn'); /* Pobramie guzika */

const btnAnimation = (e) => {

    // Pozycja w któą klikamy
    const top = e.clientY;
    const left = e.clientX;

    // Konsola zwraca współrzędne kliknięcia na przycisku
    console.log(top);
    console.log(left);

    // Pozycja przycisku
    const btnTopPosition = e.target.offsetTop;
    const btnLeftPosition = e.target.offsetLeft;

}

btn.addEventListener('click', btnAnimation);