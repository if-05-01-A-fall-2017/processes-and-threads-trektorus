#include <stdio.h>
#include <sys/types.h>
#include <string.h>
#include <stdlib.h>

#define MAX_LENGTH 256

int main(int argc, char* argv[])
{
  printf("Enter your commands below:\n");
  char input[MAX_LENGTH];
  fgets(input, MAX_LENGTH, stdin);
  char* commands;
  commands = strtok(input, "&&");
  while (commands != 0)
  {
    system(commands);
    commands = strtok(0, "&&");
  }
  return 0;
}