
import Hello from "./Hello";
import './App.css';
function App(){
  const name = "react";
  const style1 = {
    backgroundColor : 'black',
    color : 'aqua',
    fontSize : 24, // 기본단위 px 다른 단위 사용시 문자열로 선언
    padding : '1rem' 
  }
  return(
    <div>
      {/* 주석은 화면에 보이지 않음 */}
      <Hello />
      <div style={style1}>{name}</div>
      <div className="gray-box"></div>
    </div>
  );
}
export default App;