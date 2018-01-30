package enumTest;

public class PassPortConstant {
/** 申码/废码状态 */
	public static enum PASSCODE_STATUS {
		APPLIED_SUCCESS("申码成功"),
		APPLIED_FAILED("申码失败"),
		APPLIED_NOHANDLE("申码未提交"),
		APPLIED_TEMP_FAILED("申码提交，临时失败"),

		DESTROYED_SUCCESS("废码成功"),
		DESTROYED_FAILED("废码失败"),
		DESTORYED_NOHANDLE("废码未提交"),
		DESTORYED_TEMP_FAILED("废码提交，临时失败"),
		
		UPDATE_NOHANDLE("修改未提交"),
		UPDATE_SUCCESS("修改成功"),
		UPDATE_FAILED("修改失败"),
		
		ABANDON("已经丢弃");

		private final String name;

       PASSCODE_STATUS(String name) {
			this.name = name;
			System.out.println("name:"+name);
		}

		public String getCode() {
			return this.name();
		}

//		public String getCnName() {
//			return this.cnName;
//		}
//
//		public static String getCnName(String code) {
//			for (PASSCODE_STATUS item : PASSCODE_STATUS.values()) {
//				if (item.getCode().equals(code)) {
//					return item.getCnName();
//				}
//			}
//			return code;
//		}
//
//		public static PASSCODE_STATUS getbyCode(String code){
//		    for (PASSCODE_STATUS item : PASSCODE_STATUS.values()) {
//               if (item.getCode().equals(code)) {
//                   return item;
//               }
//           }
//		    return null;
//		}

		@Override
		public String toString() {
			return this.name();
		}
	}
}