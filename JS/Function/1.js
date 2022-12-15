//Normal Function
//Function Declar
function abc() {
    console.log("Hello World")
}
// Function Call
abc()

//Parameterize Function
function xyz(a, b) {
    c = a * b;
    console.log("axb:", c);
}

//xyz();//NAN is NOT a NUMBER

xyz(2, 3)
xyz(100, 3)

//121
function Palindrom(x) {
    let total = 0, remander
    actualNumber = x;

    while (x > 0) {
        remander = x % 10;
        total = (total * 10) + remander;
        x = parseInt(x / 10);
    }
    if (actualNumber === total) {
        console.log(actualNumber, "is Palindrom Number");
    } else {
        console.log(actualNumber, "is Not Palindrom Number");
    }

}

//Palindrom(123)
Palindrom(121)


function Factor() {
    let input = arguments[0], j = 4;

    while (j <= input) {

        if (input % j == 0) {
            console.log("|" + j);
        }

        j++;
    }
}

Factor(100);