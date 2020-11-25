public abstract class Number{

  public abstract double getValue();

  public int compareTo(Number other){
    if (this.getValue() < other.getValue()) return -1;
    else return 1;
  }

  //Return true when the values are within 0.001% of eachother.
  public boolean equals(Number other){
    return (Math.abs(this.getValue() - other.getValue()) <= 0.00001 * this.getValue());
  }
}
