package regex_test

fun main() {
    /** \w는 특수문자, 공백을 제외한 글자 1개씩 전체 찾음
     *  \W 는 특수문자와 공백만 찾을 때 \w와 정반대
     *  []안 ^은 not 을 뜻함 ex:[^a] or [^a-z]
     *  ^[]은 가장 처음에 오는 대문자를 찾음
     *  []은 위와 마지막 글자를 체크함 ex:[a]$ or [a-z]$
     *  []밖 .은 해당 패턴과 공백을 같이 찾음
     *  []{3} 은 지정한 길이의 문자열을 찾음
     *  []{3,5} 최소 길이 3 최대 길이 5
     */
    val testStr = "Hello World 1 2 3 4 5 \\\\ {}"
    val regex = "[a-zA-Z0-9]".toRegex()
    regex.findAll(testStr).also {
        println("대소문자와 숫자 사이즈 테스트:" + it.count())
        it.iterator().forEach { result -> print(result.groupValues) }
        println("\n첫번째 문자만 찾기:" + regex.find(testStr)?.groupValues)
    }

    //자바에서 역슬래쉬 \ 는 두번쳐야 한개임 \\ -> SIZE: 1
    val backSlashRegex = "[\\{\\\\}]".toRegex()
    backSlashRegex.findAll(testStr).also {
        println()
        println("백슬래쉬 와 특수문자 테스트:" + it.count())
        it.iterator().forEach { result -> print(result.groupValues) }
        println("\n첫번째 문자만 찾기:" + backSlashRegex.find(testStr)?.groupValues)
    }


}