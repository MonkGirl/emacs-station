package enums;

public enum OzWitch {
    // 实例必须在方法之前定义：
    WEST("Miss Gulch, aka the Wicked Witch of the West"),
    NORTH("Glinda, the Good Witch of the North"),
    EAST("Wicked Witch of the East, wearer of the Ruby Slippers, crushed by Dorothy's house"),
    SOUTH("Good by inference, but missing");

    private String description;
    // 增加自定义方法，必须先用分号结束枚举实例的序列。
    private OzWitch(String description) {
	this.description = description;
    }

    public String getDescription(){
	return description;
    }

    public static void main(String[] args){
	for (OzWitch witch : OzWitch.values()) {
	    System.out.println("-+-+-+");
	    System.out.println(witch + ": " + witch.getDescription());
	}
    }
}
