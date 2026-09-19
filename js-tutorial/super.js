class Animal {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }
}

class Rabbit extends Animal {
    constructor(name, age, runSpeed) {
        super(name, age);
        this.runSpeed = runSpeed;
    }
}

class Fish extends Animal {
    constructor(name, age, swimSpeed) {
        super(name, age);
        this.swimSpeed = swimSpeed;
    }
}

class Hawk extends Animal {
    constructor(name, age, flySpeed) {
        super(name, age);
        this.flySpeed = flySpeed;
    }
}

const rabbit = new Rabbit("Rabbit", 1, "25km");
const fish = new Fish("Shark", 5, "20km");
const hawk = new Hawk("Hawk", 3, "30km");

console.log(rabbit.name);
console.log(rabbit.age);
console.log(rabbit.runSpeed);