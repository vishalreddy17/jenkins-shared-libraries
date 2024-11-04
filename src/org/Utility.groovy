package org.example
class Utility implements Serializable {
  def script
    Utility(script) {
       this.script = script
    }
    void addAndPrintNumbers(int a, int b) {
       int result = a + b
       script.echo "The result of adding ${a} and ${b} is ${result}."
    }
}
