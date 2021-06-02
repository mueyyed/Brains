$(document).ready(function () {
    let scrollVar = { scrollLeft: '+=400' }, toLeft = false;
    animLatest();
    function animLatest() {
        toLeft = !toLeft;
        scrollVar = toLeft ? { scrollLeft: '+=400' } : { scrollLeft: '-=400' };
        $('.latest').animate(scrollVar, 4000, function (e) {
            animLatest();
        });
    }
});