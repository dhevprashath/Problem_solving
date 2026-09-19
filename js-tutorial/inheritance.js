//inheritance

class animal {
    alive = true;

    eat(){
        console.log(`this ${this.name} is eating`);
    }
    sleep(){
        console.log(`this ${this.name} is sleeping`);
    }

}

class Rabbit extends animal{
    name = "rabbit";
    run(){
        console.log(`this ${this.name} is running`);
    }
}
class Fish extends animal{
    name = "shark";
    swim(){
        console.log(`this ${this.name} is swimming`);
    }
}

const rabbit = new Rabbit();
const fish = new Fish();

console.log(rabbit.alive)
rabbit.run();
fish.swim();


