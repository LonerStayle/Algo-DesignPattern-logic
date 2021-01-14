package design_pattern

import org.junit.Test

interface OrderCommand{
    fun execute()
}
class OrderAddCommand(private val id:Long):OrderCommand{
    override fun execute()  = println("ADD $id")
}
class OrderPayCommand(private val id:Long):OrderCommand{
    override fun execute()  = println("ADDd $id")
}

class CommandProcessor{
    private val queue = mutableListOf<OrderCommand>()
    fun addToQueue(orderCommand: OrderCommand):CommandProcessor = apply {
        queue.add(orderCommand)
    }
    fun processCommands():CommandProcessor = apply {
        queue.forEach { it.execute() }
        queue.clear()
    }
}

class CommandPattern {


    @Test
    fun command(){

        CommandProcessor()
                .addToQueue(OrderAddCommand(1L))
                .addToQueue(OrderAddCommand(2L))
                .addToQueue(OrderPayCommand(2L))
                .addToQueue(OrderPayCommand(1L))
                .processCommands()
    }
}

