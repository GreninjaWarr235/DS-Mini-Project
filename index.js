class Node {  
  constructor(data, next = null) {
    this.data = data;
    this.next = next;
    this.red = 0;
    this.green = 0;
    this.blue = 0;
    this.yellow = 0;
  }
}

// Create/Get/Remove Nodes From Linked List
class LinkedList {
  constructor() {
    this.head = null;
    this.size = 0;
  }

  // Insert first node
  insertFirst(data) {
    this.blue = 0;
    this.head = new Node(data, this.head, );
    this.size++;
  }

  // Insert last node
  insertLast(data) {
    let node = new Node(data);
    let current;

    // If empty, make head
    if (!this.head) {
      this.head = node;
    } else {
      current = this.head;

      while (current.next) {
        current = current.next;
      }

      current.next = node;
    }

    this.size++;
  }

  // Insert at index
  insertAt(data, index) {
    //  If index is out of range
    if (index > 0 && index > this.size) {
      return;
    }

    // If first index
    if (index === 0) {
      this.insertFirst(data);
      return;
    }

    const node = new Node(data);
    let current, previous;

    // Set current to first
    current = this.head;
    let count = 0;

    while (count < index) {
      previous = current; // Node before index
      count++;
      current = current.next; // Node after index
    }

    node.next = current;
    previous.next = node;

    this.size++;
  }

  // Get at index
  getAt(index) {
    let current = this.head;
    let count = 0;

    while (current) {
      if (count == index) {
        console.log(current.data);
      }
      count++;
      current = current.next;
    }

    return null;
  }

  // Remove at index
  removeAt(index) {
    if (index > 0 && index > this.size) {
      return;
    }

    let current = this.head;
    let previous;
    let count = 0;

    // Remove first
    if (index === 0) {
      this.head = current.next;
    } else {
      while (count < index) {
        count++;
        previous = current;
        current = current.next;
      }

      previous.next = current.next;
    }

    this.size--;
  }

  // Clear list
  clearList() {
    this.head = null;
    this.size = 0;
  }

  // Print list data
  printListData() {
    let current = this.head;

    while (current) {
      console.log(current.data);
      current = current.next;
    }
  }
}

const ll = new LinkedList();

for(let i=0; i<72; i++) {
  ll.insertLast(`${i}`);
}

ll.printListData();

let players = ['pone', 'ptwo'];


let num1=0;
let num2=0;
var color = 'red';
const dice = document.querySelector('.dice');
let rand;
dice.addEventListener('click', () => {
  if(color == 'red') {
    color = 'blue';
    num2+=rand;
  } else if(color == 'blue') {
    color = 'red';
    num1+=rand;
  }
  rand = Math.floor(Math.random() * 6) + 1;
  dice.textContent = `${rand}`;
  for(let i=0; i<52; i++) {
    btns[i].addEventListener('click', () => {
      for(let j=0; j<52; j++) {
        btns[j].setAttribute('style', 'background-color: white');
      }
      btns[1].setAttribute('style', 'background-color: red');
      btns[14].setAttribute('style', 'background-color: green');
      btns[27].setAttribute('style', 'background-color: yellow');
      btns[40].setAttribute('style', 'background-color: blue');
      if(color=='red') {
        btns[num1].setAttribute('style', `border-radius: 50%; background-color: ${color}`);
      } else if(color=='blue') {
        btns[num2].setAttribute('style', `border-radius: 50%; background-color: ${color}`);
      } else {
        
      }
  });
  }
})

var btns = [];

for(let i=1; i<=52; i++) {
  var dem = document.querySelector(`.btn${i}`);
  btns.push(dem);
}

function move(playernum, goti) {
  

}


// var currPos = 0;
// var step = 49.5;
// var currcolor = "";
// var NumOfPaw = "";
// var clicked = false;
// var currpawn = "";
// var allcolor = ["red", "blue", "green", "yellow"];
// var pawnOut = {red:0,blue:0,green:0,yellow:0}

// function stepDown() {
//   var doc = document.getElementById(currcolor + "pawn"+NumOfPaw);
//   var curr = Number(doc.style.top.replace(/[a-z]/g, ''));
//   doc.style.top = (curr+step)+'px';
//   currPos++;
// }
// function stepUp() {
//   var doc = document.getElementById(currpawn);
//   var curr = Number(doc.style.top.replace(/[a-z]/g, ''));
//   doc.style.top = (curr - step) + 'px';
//   currPos++;
// }
// function stepLeft() {
//   var doc = document.getElementById(currpawn);
//   var curr = Number(doc.style.left.replace(/[a-z]/g, ''));
//   doc.style.left = (curr - step) + 'px';
//   currPos++;
// }
// function stepRight() {
//   var doc = document.getElementById(currpawn);
//   var curr = Number(doc.style.left.replace(/[a-z]/g, ''));
//   doc.style.left = (curr + step) + 'px';
//   currPos++;
// }

// const stepsRed = new LinkedList();
// const stepsYellow = new LinkedList();
// const stepsBlue = new LinkedList();
// const stepsGreen = new LinkedList();

// function pushSteps(value, l, count) {
//   for (i = 0; i < count; i++) l.insertLast(value);
// }

// //Green pawns path
// pushSteps(stepDown,stepsGreen,4);
// pushSteps(stepRight, stepsGreen,4);
// pushSteps(stepDown, stepsGreen,2);
// pushSteps(stepLeft, stepsGreen,4);
// pushSteps(stepDown, stepsGreen,4);
// pushSteps(stepLeft, stepsGreen,2);
// pushSteps(stepUp, stepsGreen,4);
// pushSteps(stepLeft, stepsGreen,4);
// pushSteps(stepUp, stepsGreen,2);
// pushSteps(stepRight, stepsGreen,4);
// pushSteps(stepUp, stepsGreen,4);
// pushSteps(stepRight, stepsGreen,1);
// pushSteps(stepDown, stepsGreen,5);

// //Blue pawns path
// pushSteps(stepUp, stepsBlue,4);
// pushSteps(stepLeft, stepsBlue,4);
// pushSteps(stepUp, stepsBlue,2);
// pushSteps(stepRight, stepsBlue,4);
// pushSteps(stepUp, stepsBlue,4);
// pushSteps(stepRight, stepsBlue,2);
// pushSteps(stepDown, stepsBlue,4);
// pushSteps(stepRight, stepsBlue,4);
// pushSteps(stepDown, stepsBlue,2);
// pushSteps(stepLeft, stepsBlue,4);
// pushSteps(stepDown, stepsBlue,4);
// pushSteps(stepLeft, stepsBlue,1);
// pushSteps(stepUp, stepsBlue,5);

// //Yellow pawns path
// pushSteps(stepLeft, stepsYellow,4);
// pushSteps(stepDown, stepsYellow,4);
// pushSteps(stepLeft, stepsYellow,2);
// pushSteps(stepUp, stepsYellow,4,2);
// pushSteps(stepLeft, stepsYellow,4);
// pushSteps(stepUp, stepsYellow,2);
// pushSteps(stepRight, stepsYellow,4);
// pushSteps(stepUp, stepsYellow,4);
// pushSteps(stepRight, stepsYellow,2);
// pushSteps(stepDown, stepsYellow,4);
// pushSteps(stepRight, stepsYellow,4);
// pushSteps(stepDown, stepsYellow,1);
// pushSteps(stepLeft, stepsYellow,5);

// //Red pawns path
// pushSteps(stepRight, stepsRed,4);
// pushSteps(stepUp, stepsRed,4);
// pushSteps(stepRight, stepsRed,2);
// pushSteps(stepDown, stepsRed,4);
// pushSteps(stepRight, stepsRed,4);
// pushSteps(stepDown, stepsRed,2);
// pushSteps(stepLeft, stepsRed,4);
// pushSteps(stepDown, stepsRed,4);
// pushSteps(stepLeft, stepsRed,2);
// pushSteps(stepUp, stepsRed,4);
// pushSteps(stepLeft, stepsRed,4);
// pushSteps(stepUp, stepsRed,1);
// pushSteps(stepRight, stepsRed, 5);