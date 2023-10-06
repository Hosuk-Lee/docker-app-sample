window.onload = function() {
    // HTML 요소 선택
    const element = document.getElementById('k-content'); // 대상 요소의 ID를 사용하거나 다른 선택 방법을 사용합니다.

    // 전체 화면 너비
    const windowWidth = window.innerWidth;

    // 요소의 x 위치
    const elementX = element.getBoundingClientRect().left;

    // 오른쪽 마진
    const marginRight = 24;

    // 계산된 너비
    const calculatedWidth = windowWidth - elementX - marginRight;

    console.log('계산된 너비:',calculatedWidth, windowWidth, element);
    element.style.width = calculatedWidth + 'px';

};