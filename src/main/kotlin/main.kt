package com.github.awilliams17.redcord
import org.javacord.api.DiscordApi
import org.javacord.api.DiscordApiBuilder
import com.vdurmont.emoji.EmojiParser


fun main(args : Array<String>) {
    val token = args[0]
    val discordApi = DiscordApiBuilder().setToken(token).login().join()

    discordApi.addMessageCreateListener { event ->
        //if (event.message.content.equals("test", ignoreCase = true)) {
        //    event.channel.sendMessage("test.")
        //}
    }
    
    println(discordApi.createBotInvite())
}
