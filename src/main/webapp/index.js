// script.js

document.addEventListener('DOMContentLoaded', function() {
    const display = document.getElementById('output-value');
    const buttons = document.querySelectorAll('#keyboard button');

    buttons.forEach(button => {
        button.addEventListener('click', function() {
            const buttonText = button.textContent;
            if (buttonText === '=') {
                evaluateExpression();
            } else if (buttonText === 'C') {
                clearDisplay();
            } else if (buttonText === 'CE') {
                clearLastEntry();
            } else {
                appendToDisplay(buttonText);
            }
        });
    });

    function appendToDisplay(value) {
        display.textContent += value;
    }

    function clearDisplay() {
        display.textContent = '';
    }

    function clearLastEntry() {
        display.textContent = display.textContent.slice(0, -1);
    }

    function evaluateExpression() {
        const expression = display.textContent;
        if (expression) {
            try {
                const result = eval(expression);
                display.textContent = result;
            } catch (error) {
                display.textContent = 'Error';
            }
        }
    }
});
