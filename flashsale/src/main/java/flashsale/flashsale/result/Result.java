package flashsale.flashsale.result;

public class Result<T> {
	private int code;
	private String msg;
	private T data;
	
	public static <T> Result<T> success(T data){
		return new Result<T>(data);
	}
	
	private Result(T data){
		this.data=data;
		this.msg="success";
		this.code=0;
	}
	
	public static <T> Result<T> error(CodeMsg codeMsg){
		return new Result<T>(codeMsg);
	}
	
	private Result(CodeMsg codeMsg){
		if(codeMsg==null) {
			return;
		}
		this.code=codeMsg.getCode();
		this.msg=codeMsg.getMessage();
	}
	
	public int getCode() {
		return code;
	}
	public String getMsg() {
		return msg;
	}
	public T getData() {
		return data;
	}
	
}
