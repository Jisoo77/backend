import { useState } from "react";

function Counter() {
	// let count = 0;
    const[number,setNumber] = useState(0);
	
	const onIncrease = () => {
        // setNumber(prevNumber = prevNumber+1);
        setNumber(number+1);
	} 
	const onDecrease = () => {
        // setNumber(prevNumber = prevNumber-1);
        setNumber(number-1);
	} 
	// const onIncrease = () => {
	// 	console.log('+1');
	// 	count = count + 1;
	// 	const counter = document.getElementById('counter');
	// 	counter.textContent = count;  // count가 변경되었을 때 DOM을 직접 수정
	// } 
	// const onDecrease = () => {
	// 	console.log('-1');
	// 	count = count - 1;
	// 	const counter = document.getElementById('counter');
	// 	counter.textContent = count;  // count가 변경되었을 때 DOM을 직접 수정
	// } 

	return (
	  <div >
		<h1>{number}</h1>
		<button onClick={onIncrease}>+1</button>
		<button onClick={onDecrease}>-1</button>
	  </div>
	);
  }
  
  export default Counter;