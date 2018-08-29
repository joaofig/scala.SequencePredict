package CPT

class CompactPredictionTree[T](val item: T, val parent: CompactPredictionTree[T]) {
  var children: List[CompactPredictionTree[T]] = List()
  val support: Int = 0

  def this(nodeItem: T) {
    this(nodeItem, this)
  }

  def addChild(newItem: T): Unit = {
    val node = new CompactPredictionTree[T](newItem)
    children = node :: children
  }
}
