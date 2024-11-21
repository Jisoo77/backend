import "./App.css"
import { useState } from "react"
import Title from "./Title";
function App(){
  // let TITLE = "Hello Korea!"
  // function ClickHandler(){
  //   console.log("클릭했다.")
  // }
  const [title, setTitle] = useState("Hello Korea");
  // 첫번째 인자는 값을 저장, 두번째 인자는 이변수 값의 변화를 감지
  const [text, setText] = useState("");
  const ClickHandler = () =>{
    setTitle(oldState => oldState + " plus string")
    // prev는 현재 상태값
    // 이전의 상태를 기반으로 변경 될 때 사용
    // setTitle("one more Hello Korea");
    // console.log("TITLE========");
    // console.log(TITLE);
  }
  const changeHandler = (e) => {
    // console.log(e.target.value);
    setText(e.target.value);
  }
  const onReset = () => {
    setText('');
  }

  return(
    <div className="wrapper">
      <Title title={title} text={text} />
      <div>
        <input type="text" value={text} onChange={changeHandler} />
        <button onClick={onReset}>초기화</button>
      </div>
      <button onClick={ClickHandler}>change Title</button>
      {/* <div>
        <b>값:{text}</b>
      </div> */}
    </div>
  );
}
export default App;