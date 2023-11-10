const btns = document.querySelectorAll('.btn'); /* Pobramie guzika */

const btnAnimation = e => {

    // Pozycja w którą klikamy
    const top = e.clientY;
    const left = e.clientX;

    // Konsola zwraca współrzędne kliknięcia na przycisku
    console.log(top);
    console.log(left);

    // Pozycja przycisku
    const btnTopPosition = e.target.offsetTop;
    const btnLeftPosition = e.target.offsetLeft;

    const insideBtnTop = top - btnTopPosition;
    const insideBtnLeft = left - btnLeftPosition;

    const circle = document.createElement('span');
    circle.classList.add('circle');
    circle.style.top = insideBtnTop + 'px';
    circle.style.left = insideBtnLeft + 'px';

    e.target.appendChild(circle);

    setTimeout(() => {
        circle.remove()
    },150);

}

btns.forEach(btn => btn.addEventListener('click', btnAnimation));