import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object WordCount {

  def main(args: Array[String]) {

    // Create a SparkContext to initialize Spark
    val conf = new SparkConf()
    conf.setMaster("local")
    conf.setAppName("Word Count")
    val sc = new SparkContext(conf)

    // Load the text into a Spark RDD, which is a distributed representation of each line of text
    val textFile: RDD[String] = sc.textFile("/home/michael/GitHubRepositories/CodingDojo/SparkWordCount/src/main/resources/shakespeare.txt")

    // word count
    val counts: RDD[(String, Int)] = textFile.flatMap(line => line.split(" "))
      .map(word => (word, 1))
      .reduceByKey(_ + _)

    System.out.println("Total words: " + counts.count())
    counts.saveAsTextFile("/home/michael/GitHubRepositories/CodingDojo/SparkWordCount/out/readmeWordCount.txt")
  }

}
