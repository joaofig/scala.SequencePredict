package CPT
import scala.collection.mutable

class InvertedIndex[T] {
  private val index: mutable.HashMap[T, mutable.HashSet[Int]] = mutable.HashMap.empty

  private def add(item: T, sequenceId: Int) : Unit = {
    if(!index.contains(item))
      index.put(item, mutable.HashSet.empty)
    index(item).add(sequenceId)
  }

  def containsKey(key: T): Boolean = index.contains(key)
  def get(key: T): Option[mutable.HashSet[Int]] = index.get(key)
}
