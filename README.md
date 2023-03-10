# App Cotação Moedas

Um aplicativo que utiliza API para consumir dados externos e os apresenta de forma clara e intuitiva na tela do smartphone.

O app exibe os valores da cotação atualizados do Bitcoin e da Ethereum em tempo real consumidas da API.

## 🛠️ Construído com

Ferramentas utilizadas para criar o projeto:

* [Android Studio](https://developer.android.com/studio/) - IDE usada
* [Kotlin](https://kotlinlang.org/) - Linguagem utilizada no projeto
* [Gradle](https://gradle.org/) - Automatização de buils, gerente de dependências assim como o Maven
* [Retrofit](https://square.github.io/retrofit/) - Framework para fazer requisições HTTP e como processar os dados recebidos em formato JSON
* [Corrotinas] - Padrão de projeto simultâneo para Android para simplificar o código executado de forma assíncrona
* [MVVM] Padrão de arquitetura utilizada baseada em UI. Model, View e View-Model. 

    VIEW: camada responsavel pela interação com usuario, consegue manipular estados da aplicação; onde sera mostrada os erros e as informações para o usuário.

    VIEWMODEL: interpretar as interações do usuário e preparar as informações que a view vai mostrar para o usuário responsável por saber qual estado que a view esta em determinado momento

    MODEL: regra de negócio; aqui onde as duas arquiteturas se misturam. Faz o viewmodel se comunicar com a camada de domínio. O mesmo que dizer que a camada de presentation nada mais é que a view e viewmodel.

* [LiveData] Utilizada para atualização automática da interface do usuário.

![Cotação Moedas]()

---
⌨️ com ❤️ por [Luany](https://github.com/luanyss) 😊
