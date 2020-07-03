Feature: Performing a login

  Background:
    Given Im on the login page

  Scenario Template: Login with a default user
    When I log in with a default user <userName> <password>
    Then show a welcome message on the site <messageWelcome>
    And show user name <nameUserLogin> on the site

    Examples:
      | userName                   | password   | nameUserLogin                | messageWelcome                                                                            |
      | "douglassantos@gmx.com" | "12345678" | "José Mário de Oliveira Pimentel" | "Welcome to your account. Here you can manage all of your personal information and orders." |
