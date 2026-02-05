# SplitShare - Requirements Document

## Project Overview
SplitShare is a web application that helps groups (friends, roommates, travel buddies, family) track shared expenses and contributions fairly.

Goal: Allow users to create groups, record money put in (contributions), log items bought from the shared pot, and see who owes what or who overpaid.

Target users: Young adults, students, small friend groups (5–20 people per group).

## Core Features (MVP - Minimum Viable Product)

1. User Accounts
   - Register / Login (email + password)
   - Optional: Forgot password (later phase)

2. Groups
   - Create a new group (name, description, optional invite code/link)
   - Join a group
   - View my groups

3. Inside a Group
   - Add participants (search users or manual names — start simple with usernames)
   - Record contribution (user adds money → amount + date + note)
   - Record purchase/item (description, total cost, who paid it, who benefits — start with equal split)
   - Automatic balance calculation (who owes / is owed)
   - View transaction history
   - Summary dashboard (total pot, total spent, balances per person)

4. Reports
   - Simple list/table of balances
   - Optional later: Charts (pie chart of expenses)

## Non-Functional Requirements
- Secure login (password hashed)
- Data saved even after closing browser
- Works on mobile + desktop (responsive design)
- Fast loading (under 3 seconds for main pages)

## Tech Stack (Planned)
- Backend: Java 17 + Spring Boot
- Database: PostgreSQL (local) → later hosted
- Frontend: React.js
- Authentication: JWT
- Deployment: Heroku / Render / Railway (free tiers)

## Future / Nice-to-Have (after MVP)
- Real-time updates (WebSockets)
- Notifications (email when someone adds expense + push notifications for mobile)
- Multiple currencies
- PDF export of summary
- Mobile app (React Native later)

## Success Criteria
- A user can create group → add 3 friends → contribute R100 each → buy R250 pizza → see correct balances (each is owed R16.67 if equal)
- No crashes on bad input
- Clean code + tests
- Live demo link

Version: 1.0  
Date: February 2025  
Author: Kwandokuhle