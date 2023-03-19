let carrin1 = new Carros(new MotorChevete(), "Chevette", "Chevrolet", "1976");
let carrin2 = new Carros(new MotorGolQuadrado(), "Gol", "Volkswagen", "1980");
let carrin3 = new Carros(new MotorOpala(), "Opala", "Chevrolet", "1968");
let carrin4 = new Carros(new MotorChevete(), "Uno", "Fiat", "1984");

document.write(carrin1.marca + " " + carrin1.nome + ": " + carrin1.acelerar() + "</br>");
document.write(carrin2.marca + " " + carrin2.nome + ": " + carrin2.acelerar() + "</br>");
document.write(carrin3.marca + " " + carrin3.nome + ": " + carrin3.acelerar() + "</br>");
document.write(carrin4.marca + " " + carrin4.nome + ": " + carrin4.acelerar() + "</br>");