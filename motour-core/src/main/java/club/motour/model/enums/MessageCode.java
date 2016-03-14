package club.motour.model.enums;

public enum MessageCode {

	TEST("0001"),
	VCODE_EXPIRED("0002"),
	VCODE_INCORRECT("0003"),
	USER_ID_NOT_EXIST("0004"),
	USER_HAS_ENABLED("0005"),
	PASSWORD_INCORRECT("0006"),
	USER_DISABLED("0007"),
	USER_PROFILE_UPDATE_SUCCESS("0008"),
	CREATE_ORDER_ERROR("0011"),
	CREATE_ORDER_SUCCESS("0012"),
	REPEAT_SUBMIT_ERROR("0013"),
	CONTACT_US_DONE("0014"),
	SESSION_TIME_OUT("0016"),
	USER_NOT_VALID("0017"),
	USER_NOT_LOGIN_YET("0018"),
	UPDATE_ROLE_SUCCESS("0019"),
	CREATE_ROLE_SUCCESS("0020"),
	DELETE_DATA_SUCCESS("0021"),
	CONFIRM_DELETE("0022"),
	DELETE_DATA_FAIL("0023"),
	TRANSACTION_FAIL("0024"),
	UPDATE_MANAGER_SUCCESS("0025"),
	CREATE_MANAGER_SUCCESS("0026"),
	PASSWORD_UPDATE_SUCCESS("0027"),
	PASSWORD_UPDATE_FAIL("0028"),
	CREATE_MANAGER_FAIL("0029"),
	UPDATE_MANAGER_FAIL("0030"),
	USER_PROFILE_UPDATE_FAIL("0031");
	
	private final String code;
	
	private MessageCode(String code) {
		this.code = code;
	}
	
	@Override
	public String toString() {
		return code;
	}
}