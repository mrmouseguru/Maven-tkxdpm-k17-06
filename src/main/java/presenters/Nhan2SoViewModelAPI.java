package presenters;

public class Nhan2SoViewModelAPI {
	private boolean success;
    private String message;
    private Integer result; // nullable for error cases

    public Nhan2SoViewModelAPI() {}

    public boolean isSuccess() { return success; }
    public void setSuccess(boolean success) { this.success = success; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public Integer getResult() { return result; }
    public void setResult(Integer result) { this.result = result; }
}
