data class ListItem(val list: List<Int>)

fun ListItem.filter(): ListItem{
    val filteredList = list.filter { it -> it < 500 }
    return ListItem(filteredList)
}

fun ListItem.pritAll(){
    list.forEach{it -> println(it) }
}
fun main() {
    val list1 = ListItem(listOf<Int>(13,221,333,4243,532,1126,72112,24328,123429,123210))
    val modifiedList: ListItem = list1.filter()
    modifiedList.pritAll()
}
