function Wrapper({children}){
const style4={
    border:'2px solid black',
    padding:'16px'
}

    return(
        <div style={style4}>
            {children}
        </div>
    );
}
export default Wrapper;