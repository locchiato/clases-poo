window.onload = () => {
    const clase = document.querySelector('h1')
        .innerText.replace(' ', '').toLowerCase();

    document.querySelector('main').innerHTML += `
    <img src="${clase}/pg/${clase}.png" />
    `
}