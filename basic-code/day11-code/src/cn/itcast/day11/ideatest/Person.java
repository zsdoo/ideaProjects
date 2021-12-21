class Person{
    private String name;
    private String idStr;
    public Person(){}
    public Person(String name, String idStr){
        this.name = name;
        this.idStr= idStr;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getIdStr() {
        return idStr;
    }
    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj != null && obj.getClass() == Person.class){
            Person personObj = (Person)obj;
            if (this.getIdStr().equals(personObj.getIdStr())){
                return true;
            }
        }
        return false;
    }
}