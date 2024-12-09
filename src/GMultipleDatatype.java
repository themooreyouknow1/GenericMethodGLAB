public class GMultipleDatatype <Datatypeone, Datatypetwo>{
    Datatypeone valueOne;
    Datatypetwo valueTwo;

    public GMultipleDatatype(Datatypeone valueOne, Datatypetwo valueTwo){
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    public Datatypeone getValueOne() {
        return valueOne;
    }

    public void setValueOne(Datatypeone valueOne) {
        this.valueOne = valueOne;
    }

    public Datatypetwo getValueTwo() {
        return valueTwo;
    }

    public void setValueTwo(Datatypetwo valueTwo) {
        this.valueTwo = valueTwo;
    }

}

