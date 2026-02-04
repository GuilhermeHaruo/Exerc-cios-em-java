# ☕ Java Mastery: Da Lógica à Arquitetura

Este repositório documenta minha evolução técnica na linguagem Java, apresentando uma trilha de aprendizado que parte de algoritmos fundamentais até a manipulação de estruturas de dados complexas e tratamento de erros avançado. O objetivo final é consolidar a base necessária para o desenvolvimento de sistemas utilizando o padrão **MVC (Model-View-Controller)**.

---

## 🛠️ Tecnologias e Conceitos
* **Linguagem:** Java 17+
* **Paradigma:** Orientação a Objetos (POO)
* **Arquitetura:** Estruturas preparadas para desacoplamento em camadas.

---

## 📂 Trilhas de Aprendizado

Abaixo, os módulos organizados por nível de complexidade:

### 🔵 Nível 1: Fundamentos e Lógica
* **01. Condicionais Simples (`atv1`):** Prática intensiva de estruturas de decisão (`if/else`) e interações básicas com o usuário via console.
* **02. Operadores Lógicos (`atv2`):** Implementação de lógica booleana avançada (`&&`, `||`, `!`) para validação de regras de negócio complexas.

### 🟡 Nível 2: Resiliência e Estruturas Lineares
* **03. Arrays & Exceções (`atv3`):** Gestão de vetores estáticos e introdução ao tratamento de erros para evitar interrupções no fluxo do programa.
* **04. Exceções Customizadas (`atv4`):** Criação de classes de erro personalizadas (`extends Exception`) para maior controle semântico do software.

### 🔴 Nível 3: Collections Framework (Avançado)
* **05. Listas Dinâmicas (`atv5`):** Manipulação de `ArrayList`, incluindo ordenação (`Collections.sort`), buscas e embaralhamento.
* **06. Estruturas Set (`atv6`):** Garantia de unicidade de dados com `HashSet` e `TreeSet`, utilizando contratos de `hashCode`, `equals` e `Comparable`.
* **07. Estruturas Map (`atv7`):** Implementação de dicionários (Chave-Valor) para buscas rápidas e mapeamento de dados ordenados.

---

## 🏗️ Preparação para o MVC

O conhecimento consolidado aqui reflete a divisão de responsabilidades exigida pelo mercado:

1.  **Model:** Representado pela criação de classes de domínio (como `Produto` e `Compromisso`) com atributos privados e regras de identidade.
2.  **Controller:** Lógica de processamento presente nos métodos de validação e na manipulação de coleções.
3.  **View:** Interação direta com o usuário final através da classe `Scanner`.
