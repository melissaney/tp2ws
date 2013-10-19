package tp2ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "number1",
    "number2"
})
@XmlRootElement(name = "AddNumbers")

public class AddNumbers {
	protected int number1;
    protected int number2;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int value) {
        this.number1 = value;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int value) {
        this.number2 = value;
    }
}

