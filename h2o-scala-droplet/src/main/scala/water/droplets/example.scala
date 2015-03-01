package water.droplets

import java.io.File

import water._
import water.fvec._

object example {
  def main(args: Array[String]) {
    //
    // Load data
    //
    
    // Shortcut for local files
    val myfile = new java.io.File("/tmp/allyears_tiny.csv")
    val air = new DataFrame(myfile)
    
    // end of demo
  }
}
