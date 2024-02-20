# Spring AI

Spring WebMvc 기반 Spring AI 샘플

- 사전준비

    https://platform.openai.com/account/billing 에 들어가서 API 를 호출할 때 필요한 비용을 처리할 사용할 카드를 등록한다

    OpenAI API Key 를 application.properties 에 추가한다

- 호출 예제

```
curl "http://localhost:8080/ai/chat?message=hello"
```