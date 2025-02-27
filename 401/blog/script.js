function sendMessage() {
    const messageInput = document.getElementById('message-input');
    const message = messageInput.value.trim();

    if (message !== "") {
        const chatMessages = document.getElementById('chat-messages');
        const newMessage = document.createElement('div');
        
        newMessage.classList.add('message', 'outgoing');
        newMessage.textContent = message;
        
        chatMessages.appendChild(newMessage);
        messageInput.value = "";
        messageInput.focus();

        // Add the chat server logic here to handle incoming messages and responses.

        // For this basic example, we'll just simulate a reply after a short delay.
        setTimeout(sendReply, 1000);

        function sendReply() {
            const chatMessages = document.getElementById('chat-messages');
            const replyMessage = document.createElement('div');
            
            replyMessage.classList.add('message', 'incoming');
            replyMessage.textContent = 'Hello! This is a sample reply';
            
            chatMessages.appendChild(replyMessage);
        }
    }
}
