function filtraPares(arr) {
    return arr.filter(callback)
}

function callback(item){
    return item % 2 === 0;
}

const meuArray = [1, 23, 54, 654, 23, 2, 4];

console.log(filtraPares(meuArray));