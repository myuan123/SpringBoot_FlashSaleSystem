package flashsale.flashsale.result;

public class CodeMsg {
	private int code;
	private String message;
	//通用模块
	public static final CodeMsg SUCCESS= new CodeMsg(0,"success");
	public static final CodeMsg SERVER_ERROR=new CodeMsg(500100,"server error");
	
	//登录模块 5002XX
	
	
	//商品模块 5003XX
	
	
	
	//订单模块 5004XX
	
	private CodeMsg(int code,String msg) {
		this.code=code;
		this.message=msg;
	}
	public int getCode() {
		return code;
	}
	public String getMessage() {
		return message;
	}
}
