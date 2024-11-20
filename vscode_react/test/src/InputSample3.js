import { useState, useRef } from "react";

function InputSample3(){
    const [inputs,setinputs] = useState({
        name:'',
        nickname:'',
        email:''
    });
    const nameInput = useRef();

    const {name, nickname, email} = inputs; // 비구조화 할당으로 값을 추출
    const onChange = (e) =>{
        const {value, name} = e.target; // e.target에서 name과 value 추출
        setinputs({
            ...inputs, // 지금 쓰는것과 별도로 입력한 기존값 불러와라
            [name]:value, // name의 키값을 업데이트
        });
    }
    const onReset = () =>{
        setinputs({
            name:'',
            nickname:'',
            email:''
        });
        nameInput.current.focus(); // input창을 클릭해서 커서를 깜빡여라
    }

    return(
        <div>
            <input name="name" onChange={onChange} value={name} placeholder="이름" ref={nameInput}/>
            <input name="nickname" onChange={onChange} value={nickname} placeholder="닉네임"/>
            <input name="email" onChange={onChange} value={email} placeholder="이메일"/>
            <button onClick={onReset}>초기화</button>
            <div>
                <b>값: </b>
                {name}({nickname}) - {email}
            </div>
        </div>
    );
}
export default InputSample3;