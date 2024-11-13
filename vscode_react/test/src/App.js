import Hello from "./Hello";
import './App.css';
function App(){
  const name = 'react';
  const style1 = {
    backgroundColor:'black',
    color:'aqua',
    fontSize:24, // 기본단위 px
    padding:'1rem' // 다른 단위는 문자열
  }
  return(
    <>
    {/* 주석은 화면에 안보임 */}
    /* 중괄호로 안감싸면 화면에 출력 */
      <Hello
      // 열리는 태그 내부에서는 이렇게 주석 작성
      />
      <div style={style1}>{name}</div>
      <div className="lime-box"></div>
    </>
  );
}
export default App;