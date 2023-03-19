class Carros {
#nome;
#marca;
#ano;

    constructor (Motor, n, m, a) {
        this.motor = Motor;
        this.#nome = n;
        this.#marca= m;
        this.#ano = a;
        }

        acelerar () {
            return this.motor.acelerar (); }
       

    get nome() {
        console.log("get nome() {CONGRATULATION}");
        return this.#nome; }   

    set nome(nome) {
        console.log("set nome() {CONGRATULATION}");
        this.#nome = nome; }   

        get marca() {
            console.log("get marca() {CONGRATULATION}");
            return this.#marca; }   
        
        set marca(marca) {
            console.log("set marca() {CONGRATULATION}");
            this.#marca = marca; }

            get ano() {
                console.log("get ano() {CONGRATULATION}");
                return this.#ano; }   
            
            set ano(ano) {
                console.log("set ano() {CONGRATULATION}");
                this.#ano = ano; }
            
            }
          
