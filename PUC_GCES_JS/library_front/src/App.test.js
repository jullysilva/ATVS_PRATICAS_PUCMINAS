import { render, screen } from '@testing-library/react';
import App from './App';

test('renders perfil link to profile of user', () => {
  render(<App />);
  const linkElement = screen.getByText("Perfil");
  expect(linkElement).toBeInTheDocument();
});

test('soma dois números', () => {
  const resultado = 2 + 3;
  expect(resultado).toBe(5);
});
