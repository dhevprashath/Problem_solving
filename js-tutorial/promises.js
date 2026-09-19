// Promise functions

function walkDog() {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log("Dog is being walked");
            resolve();
        }, 1000);
    });
}

function cleanKitchen() {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log("Kitchen is being cleaned");
            resolve();
        }, 1000);
    });
}

function trashOut() {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log("Trash is being taken out");
            resolve();
        }, 1000);
    });
}

walkDog()
    .then(() => cleanKitchen())
    .then(() => trashOut())
    .then(() => {
        console.log("All tasks are done");
    })
    .catch(error => {
        console.error(error);
    });